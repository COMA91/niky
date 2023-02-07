<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" session="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html lang="en">
<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<link rel="stylesheet" href="style.css" />
<style type="text/css">
html, body #slidebar {
	margin: 0;
	padding: 0;
	width: 100%;
	height: 100%;
}

#slidebar {
	box-sizing: border-box;
}

body #slidebar {
	display: flex;
	justify-content: center;
	align-items: center;
}

#slidebar {
	width: 500px;
	height: 300px;
	background-color: #ecf0f1;
}

#slidebar .slider {
	width: 100%;
	height: 100%;
	/* 후에 padding: 1.5rem 2rem 으로 수정합니다. 참고바랍니다. */
	padding: 1.5rem;
	display: flex;
	flex-direction: column;
	justify-content: flex-start;
	align-items: center;
	position: relative;
}

#slidebar input {
	width: calc(100% - 2rem);
	top: 3rem;
	left: 1rem;
	position: absolute;
	border: none;
}

#slidebar input:first-child {
	top: 1rem;
}

#slidebar .track {
	position: relative;
	width: 100%;
	height: 0.5rem;
	margin-top: 5rem;
	background-color: #bdc3c7;
	border-radius: 0.5rem;
}

#slidebar .range {
	position: absolute;
	top: 0;
	bottom: 0;
	left: 0;
	right: 0;
	background-color: #2c3e50;
}

#slidebar .thumb {
  position: absolute;
  top: 0;
  transform: translateY(-0.25rem);
  width: 1rem;
  height: 1rem;
  background-color: black;
  border-radius: 50%;
}

#slidebar .left {
  left: 0;
}

#slidebar .right {
  right: 0;
}

#slidebar input {
  width: calc(100% - 2rem);
  top: 1rem;
  left: 1rem;
  position: absolute;
  border: none;
  pointer-events: none;
  z-index: 10;
  appearance: none;
  opacity: 0;
}

#slidebar input::-webkit-slider-thumb {
  pointer-events: all;
  width: 2.5rem;
  height: 1.5rem;
}
</style>
</head>
<body>
	<form>
		<div class="input-group mb-3">
			<div class="input-group-prepend col-sm-2">
				<select class="custom-select" name="sex" id="sex">
					<option selected>성별</option>
					<option value="F">여성의류</option>
					<option value="M">남성의류</option>
				</select>
			</div>

			<div class="input-group-prepend col-sm-2" id="slidebar">
				<label for="formControlRange">가격 범위</label>
				<div class="slider" id="formControlRange">
					<input type="range" name="input_left" id="input_left" min="0" max="9999999" value="0" />
					<input type="range" name="input_right"  id="input_right" min="0" max="9999999"
						value="9999999" />
					<div class="track">
						<div class="range"></div>
						<div class="thumb left"></div>
						<div class="thumb right"></div>
					</div>
				</div>

				<div id="range_val row">
					<input class="border-0 bg-white" name="left_val" id="left_val"> ~ <input
						class="border-0 bg-white" name="right_val" id="right_val">
				</div>
			</div>

			<div class="input-group-prepend col-sm-2">
				<div class="input-group-prepend">
					<label class="input-group-text" for="category">Category</label>
				</div>
				<select class="custom-select" name="category" id="category">
					<option selected>category</option>
					<option value="shirt">shirt</option>
					<option value="pants">pants</option>
					<option value="underwear">underwear</option>
					<option value="shoes">shoes</option>
					<option value="outfit">outfit</option>
					<option value="etc">etc</option>
				</select>
			</div>

			<input type="text" class="form-control" aria-label="검색 키워드"
				aria-describedby="button-addon2" name="keyword">

			<div class="input-group-append">
				<button class="btn btn-outline-secondary" type="button"
					id="search_submit">검색</button>
			</div>
		</div>


		<script type="text/javascript">
			const inputLeft = document.getElementById("input_left");
			const inputRight = document.getElementById("input_right");
			
			const thumbLeft = document.querySelector(".thumb.left");
			const thumbRight = document.querySelector(".thumb.right");
			
			const range = document.querySelector(".range");
			
			const setLeftValue = e => {
				const _this = e.target;
				const { value, min, max } = _this;
				
				if (+inputRight.value - +value < 10) {
					_this.value = +inputRight.value - 10;
				}
				
				const percent = ((+_this.value - +min) / (+max - +min)) * 100;
				
				thumbLeft.style.left = `${percent}%`;
				range.style.left = `${percent}%`;
			};
			
			const setRightValue = e => {
				const _this = e.target;
				const { value, min, max } = _this;
				
				if (+value - +inputLeft.value < 10) {
					_this.value = +inputLeft.value + 10;
				}
				
				const percent = ((+_this.value - +min) / (+max - +min)) * 100;
				
				thumbRight.style.right = `${100 - percent}%`;
				range.style.right = `${100 - percent}%`;
			};
			
			if (inputLeft && inputRight) {
				inputLeft.addEventListener("input", setLeftValue);
				inputRight.addEventListener("input", setRightValue);
			}
		
			$("document").ready(function() {
				let minprice = 0;
				let maxprice = 0;

				$("#input_left").change(function() {
					minprice = $("#input_left").val();
					$("#left_val").val(minprice);
				});
				
				$("#input_right").change(function() {
					maxprice = $("#input_right").val();
					$("#right_val").val(maxprice);
				});
			});
		</script>
	</form>
</body>
</html>
