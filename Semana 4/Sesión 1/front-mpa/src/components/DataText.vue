<template>
  <div class="nameText">
    <h1>{{ nameText }}</h1>
    
   <!-- <input type="email" class="form-control" name="{{ nameText }}" id="{{ nameText }}" placeholder="{{ nameText }}"> -->
  </div>
  <div class="input-group mb-3">
      <span class="input-group-text">$</span>
      <input type="text" class="form-control" aria-label="Amount (to the nearest dollar)">
      <span class="input-group-text">.00</span>
    </div>
</template>

<script>
export default {
  name: 'DataText',
  props: {
    name: String
  }
}
</script>

