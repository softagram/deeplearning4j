/*******************************************************************************
 * Copyright (c) 2015-2018 Skymind, Inc.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Apache License, Version 2.0 which is available at
 * https://www.apache.org/licenses/LICENSE-2.0.
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 *
 * SPDX-License-Identifier: Apache-2.0
 ******************************************************************************/

//
//  @author sgazeos@gmail.com
//
#ifndef __IMAGE_RESIZE_HELPERS__
#define __IMAGE_RESIZE_HELPERS__
#include <op_boilerplate.h>
#include <NDArray.h>

namespace nd4j {
namespace ops {
namespace helpers {

    template <typename T>
    int resizeBilinearFunctor(NDArray<T> const* image, int width, int height, bool center, NDArray<T>* output);
    template <typename T>
    int resizeNeighborFunctor(NDArray<T> const* image, int width, int height, bool center, NDArray<T>* output);
    template <typename T>
    void cropAndResizeFunctor(NDArray<T> const* images, NDArray<T> const* boxes, NDArray<T> const* indices, NDArray<T> const* cropSize, int method, T extrapolationVal, NDArray<T>* crops);
}
}
}
#endif
