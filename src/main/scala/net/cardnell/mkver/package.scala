package net.cardnell

import zio.Has

package object mkver {
  type Git = Has[Git.Service]

  val GitMkverVersion = "1.3.0"
}
