import { Doughnut, mixins } from "vue-chartjs";
export default {
  extends: Doughnut,
  props: ["data", "options"],
  mounted() {
    // this.chartData is created in the mixin.
    // If you want to pass options please create a local options object
    this.renderChart(this.data, {
      borderWidth: "10px",
      hoverBackgroundColor: "red",
      hoverBorderWidth: "10px"
    });
  }
};

// import { Pie, mixins } from "vue-chartjs";
// const { reactiveProp } = mixins

// export default {
//   extends: Pie,
//   props: ["options"],  // props: ["data", "options"],
//   mounted() {
//     // this.chartData is created in the mixin.
//     // If you want to pass options please create a local options object
//     this.renderChart(this.chartData, this.options={
//       borderWidth: "10px",
//       hoverBackgroundColor: "red",
//       hoverBorderWidth: "10px"
//     });
//   }
// };

// import { Doughnut, mixins } from "vue-chartjs";
// export default {
//   extends: Doughnut,
//   props: ["data", "options"],
//   mounted() {
//     // this.chartData is created in the mixin.
//     // If you want to pass options please create a local options object
//     this.renderChart(this.data, {
//       borderWidth: "10px",
//       hoverBackgroundColor: "red",
//       hoverBorderWidth: "10px"
//     });
//   }
// };
