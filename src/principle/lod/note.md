### 迪米特法则理解（Law of Demeter）
### 又称最少知识原则（Least Knowledge Principle）
#### 通俗地讲，一个类应该对自己需要耦合或调用的类知道得最少，你（被耦合或调用的类）的内部是如何复杂都和我没关系，那是你的事情，我就知道你提供的这么多public方法，我就调用这么多，其他的我一概不关心。
#### 一个类公开的public属性或方法越多，修改时涉及的面也就越大，变更引起的风险扩散也就越大。因此，为了保持朋友类间的距离，在设计时需要反复衡量：是否还可以再减少public方法和属性，是否可以修改为private、package-private（包类型，在类、方法、变量前不加访问权限，则默认为包类型）、protected等访问权限，是否可以加上final关键字等。