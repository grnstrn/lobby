<template>
    <v-card class="my-6">
        <v-card-text primary-title>
        <i>({{ message.id }})</i>
            {{ message.text }}
        </v-card-text>
        <media v-if="message.link" :message="message"></media>
        <v-card-actions >

<!--            <v-btn icon @click="fav" normal text color="green" text >-->
<!--                <v-icon>favorite</v-icon>-->
<!--            </v-btn>-->
<!--            <v-btn icon @click="addToBuy" small text color="green" text>-->
<!--                <v-icon>shopping_cart</v-icon>-->
<!--            </v-btn>-->
<!--                <v-btn icon @click="pay" small text rounded color="green" text >-->
<!--                    <v-icon>credit_card</v-icon>-->
<!--                </v-btn>-->
            </v-btn>
            <v-btn icon @click="edit" small text rounded color="grey">
                <v-icon >settings</v-icon>
            </v-btn>

            <v-btn icon @click="del" small color="grey">
                <v-icon>delete</v-icon>
            </v-btn>
        </v-card-actions>
    </v-card>
</template>

<script>
    import { mapActions } from 'vuex'
    import Media from 'components/media/Media.vue'


    export default {
        props: ['message', 'editMessage' ],
        components: { Media },

        methods: {
            ...mapActions(['removeMessageActions']),

            edit() {
                this.editMessage(this.message)
            },
            del() {
                this.removeMessageAction(this.message)
            }
        }
    }
</script>

<style>
</style>