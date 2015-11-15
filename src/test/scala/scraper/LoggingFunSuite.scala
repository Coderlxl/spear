package scraper

import org.scalatest.{ Outcome, FunSuite }
import scraper.utils.Logging

trait LoggingFunSuite extends FunSuite with Logging {
  override protected def withFixture(test: NoArgTest): Outcome = {
    try {
      logInfo(s"Log output for test '${test.text}' {{{")
      test()
    } finally {
      logInfo(s"}}}\n")
    }
  }
}
