<template>
  <div id="rank-box">
      <router-link :to="`/userProfile/${user_no}`" style="color: black;">
        <span class="text">
            <div v-if="user_no>0" class="square" :class="{rank1 : (ranking==1), rank2 : (ranking==2), rank3 : (ranking==3) }"   :style="{'background-image' : `url(${require('@/assets/images/icons/rankMedal.jpg')})`}" alt="medal"></div>
            <!-- <div v-if="user_no>0" class="square" :class="{rank1 : (ranking==1), rank2 : (ranking==2), rank3 : (ranking==3) }"   :style="{'background-image' : `url('/static/images/icon/rankMedal.jpg')`}" alt="medal"></div> -->
        </span>
        <span>
            <img class="circle" :src='require(`@/assets/images/user/${user_image}`)' alt="ranking_user_image">
            <!-- <img class="circle" :src='`/static/images/user/${user_image}`' alt=""> -->
        </span>
        <span class="text name">{{name}}</span>
        <span class="text score">{{score}}p</span>
      </router-link>
  </div>
</template>

<script>
export default {
    name: 'Rank',
    props: ['ranking', 'user_no', 'name', 'score', 'user_image'],
    data() {
        return{
            
        }
    },
    created() {
        console.log("점수: " + this.score);
        console.log("이름: " + this.name);
    },
}
</script>

<style lang="scss" scoped>
#rank-box{
    text-align: left;
    display: inline-block;
    // background-color: grey;
    // border-top: 1px solid black;
    border-bottom: 1px solid black;
    width: 90%;
    padding: 1vw;
    * {
        vertical-align: middle;
    }
    .circle {
        display: inline-block;
        width: 15vw;
        border-radius: 100%;
    }
    .circle{
        margin-left: 5vw;
    }
    .square {
        display: inline-block;
        width:12vw;
        height:12vw;
        background-size: 55vw;
    }
    .rank1{
        border-radius: 6vw;
        background-position-x: -0.5vw;
        background-position-y: -1vw;
    }
    .rank2{
        border-radius: 6vw;
        background-position-x: -11vw;
        background-position-y: -1vw;
    }
    .rank3{
        border-radius: 6vw;
        background-position-x: -21.7vw;
        background-position-y: -1vw;
    }
    .name {
        font-size: 5vw;
        margin-left: 5vw;
    }
    .score {
        display: inline-block;
        width: 15vw;
        text-align: right;
        font-size: 3vw;
        margin-left: 10vw;
    }
}
</style>