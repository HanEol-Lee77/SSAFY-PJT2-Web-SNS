<template>
  <transition name="modal" appear>
    <div class="modal modal-overlay" @click.self="$emit('close')" @keyup.esc="$emit('close')" >
      <div id="modal" class="modal-wrapper">
        <div class="modal-container">
          <div class="modal-header">
            <slot name="header">  </slot>
          </div>
          <div class="modal-body">
            <slot name="body">  </slot>
          </div>
          <div class="modal-footer">
            <slot name="footer">
              <button @click="$emit('close')">Close</button>              
            </slot>
          </div>
					     
        </div>
      </div>
    </div>
  </transition>
</template>

<style lang="scss" scoped>
.modal-overlay {
  display: flex;
  align-items: center;
  justify-content: center;
  position: fixed;
  z-index: 30;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  background: rgba(0, 0, 0, 0.5);
  transition: opacity .3s ease;
  }
.modal-wrapper {
  display: table-cell;
  vertical-align: middle;
  width: 100%;
}
.modal-container {
  width: 80%;
  margin: 0px auto;
  padding: 20px 30px;
  background-color: #fff;
  border-radius: 2px;
  box-shadow: 0 2px 8px rgba(0, 0, 0, .33);
  transition: all .3s ease;
  font-family: Helvetica, Arial, sans-serif;
  // padding-bottom: 50px;
}
.modal-header h3 {
  margin-top: 0;
  color: #FF339E;
}
.modal-body {
  margin: 20px 0;
}
.modal-default-button {
  float: right;
}
.modal-enter {
  opacity: 0;
}
.modal-leave-active {
  opacity: 0;
}
.modal-enter .modal-container,
.modal-leave-active .modal-container {
  -webkit-transform: scale(1.1);
  transform: scale(1.1);
}
@media (min-width: 600px) {
  .modal-wrapper {
    width: 600px;
}
}
</style>