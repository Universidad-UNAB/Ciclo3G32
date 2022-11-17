<template>
  <img alt="Vue logo" src="./assets/logo.png">
  <HelloWorld msg="Welcome to Your Vue.js App" />
  <!-- <HelloWorld msg="Welcome to Your Vue.js App"/> -->
  <DataButton msg="Welcome to Your Vue.js App" />

  <div>
    <table>
      <tr>
        <td>
          <label>Nombre</label>
          <DataText nameText="nombre" />
        </td>
      </tr>
      <tr>
        <td>
          <label>Apellido</label>
          <DataText nameText="apellido" />
        </td>
      </tr>
      <tr>
        <td>
          <label>Edad</label>
          <DataText nameText="edad" />
        </td>
      </tr>
      <tr>
        <td>
          <label>Celular</label>
          <DataText nameText="celular" />
        </td>
      </tr>

      <tr>
        <td>
          <label>Edad</label>
          <DataText nameText="edad" />
        </td>
      </tr>
      <tr>
        <td>
          <label>Celular</label>
          <DataText nameText="celular" />
        </td>
      </tr>

      <tr>
        <td>
          <label>Edad</label>
          <DataText nameText="edad" />
        </td>
      </tr>
      <tr>
        <td>
          <label>Celular</label>
          <DataText nameText="celular" />
        </td>
      </tr>

      <tr>
        <td>
          <label>Edad</label>
          <DataText nameText="edad" />
        </td>
      </tr>
      <tr>
        <td>
          <label>Celular</label>
          <DataText nameText="celular" />
        </td>
      </tr>

    </table>

  </div>
</template>

<script>
import HelloWorld from './components/HelloWorld.vue'
import DataButton from './components/DataButton.vue'
import DataText from './components/DataText.vue'
export default {
  name: 'App',
  components: {
    HelloWorld,
    DataButton,
    DataText
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
