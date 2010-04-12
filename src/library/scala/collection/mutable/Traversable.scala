/*                     __                                               *\
**     ________ ___   / /  ___     Scala API                            **
**    / __/ __// _ | / /  / _ |    (c) 2003-2010, LAMP/EPFL             **
**  __\ \/ /__/ __ |/ /__/ __ |    http://scala-lang.org/               **
** /____/\___/_/ |_/____/_/ | |                                         **
**                          |/                                          **
\*                                                                      */

// $Id$


package scala.collection
package mutable

import generic._

/** A trait for traversable collections that can be mutated.
 *  $traversableInfo
 *  @define mutability mutable
 */
trait Traversable[A] extends scala.collection.Traversable[A]
                        with GenericTraversableTemplate[A, Traversable]
                        with TraversableLike[A, Traversable[A]]
                        with Mutable {
  override def companion: GenericCompanion[Traversable] = Traversable
}

/** $factoryInfo
 *  @define Coll mutable.Traversable
 *  @define coll mutable traversable
 */
object Traversable extends TraversableFactory[Traversable] {
  implicit def canBuildFrom[A]: CanBuildFrom[Coll, A, Traversable[A]] = new GenericCanBuildFrom[A]
  def newBuilder[A]: Builder[A, Traversable[A]] = new ArrayBuffer
}


