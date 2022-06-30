<script>
export default {
    name: 'Customers',
        data() {
            return {
                customers: []
            };
        },
    async mounted() {
        let query = `query myQuery{
            getAllCustomers{
                custCode
                custName
                agentCode
            }
        }`;

        // API CALL
        try {
            let res = await fetch('http://localhost:8080/graphql', {
                method: 'POST',
                headers: {
                    'content-type': 'application/json'
                },
                body: JSON.stringify({ query }),
            });

            res = await res.json();

            const response = res.data;
            this.customers = response.getAllCustomers;
        } catch (error) {
            console.log(error);
        }
    },
};
</script>

<template>
    <section class="clients">      
        <h1>Tabella ordini</h1>
        <table id="firstTable">
            <thead>
                <tr>
                    <th>Codice cliente</th>
                    <th>Nome cliente</th>
                    <th>Codice agente</th>
                </tr>
            </thead>
            <tbody>
                <tr v-for="cust in customers">
                    <td>{{cust.custCode}}</td>
                    <td>{{cust.custName}}</td>
                    <td>{{cust.agentCode}}</td>
                </tr>
            </tbody>
        </table>
    </section>
</template>
