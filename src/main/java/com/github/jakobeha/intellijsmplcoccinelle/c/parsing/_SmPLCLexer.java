/* The following code was generated by JFlex 1.7.0-SNAPSHOT tweaked for IntelliJ platform */

package com.github.jakobeha.intellijsmplcoccinelle.c.parsing;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static com.github.jakobeha.intellijsmplcoccinelle.c.psi.SmPLCTypes.*;

@SuppressWarnings("ALL")

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0-SNAPSHOT
 * from the specification file <tt>src/main/java/com/github/jakobeha/intellijsmplcoccinelle/c/parsing/_SmPLCLexer.flex</tt>
 */
public class _SmPLCLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   * Chosen bits are [7, 7, 7]
   * Total runtime size is 1928 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[(ZZ_CMAP_Y[ZZ_CMAP_Z[ch>>14]|((ch>>7)&0x7f)]<<7)|(ch&0x7f)];
  }

  /* The ZZ_CMAP_Z table has 68 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\103\200");

  /* The ZZ_CMAP_Y table has 256 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\1\1\53\2\1\3\22\2\1\4\37\2\1\3\237\2");

  /* The ZZ_CMAP_A table has 640 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\0\5\1\22\0\1\71\1\35\1\7\1\37\1\0\1\32\1\33\1\0\1\15\1\16\1\4\1\13\1\25"+
    "\1\27\1\11\1\2\12\5\1\26\1\24\1\10\1\31\1\12\1\30\1\0\4\6\1\75\1\6\1\76\1"+
    "\6\1\72\4\6\1\73\3\6\1\3\1\6\1\74\6\6\1\20\1\14\1\21\1\34\1\40\1\0\1\41\1"+
    "\45\1\55\1\64\1\47\1\56\1\63\1\51\1\44\1\6\1\62\1\60\1\67\1\52\1\57\1\66\1"+
    "\6\1\43\1\54\1\42\1\46\1\65\1\50\1\61\1\53\1\70\1\22\1\17\1\23\1\36\6\0\1"+
    "\1\32\0\1\1\337\0\1\1\177\0\13\1\35\0\2\1\5\0\1\1\57\0\1\1\40\0");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\1"+
    "\1\7\1\10\1\11\1\12\1\1\1\13\1\14\1\15"+
    "\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25"+
    "\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\1"+
    "\22\4\1\35\1\0\1\36\1\37\1\0\1\40\1\41"+
    "\2\0\1\42\1\0\1\43\1\44\1\45\1\46\1\47"+
    "\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57"+
    "\1\60\1\61\1\62\1\63\1\64\1\65\4\0\7\4"+
    "\1\66\25\4\1\67\3\4\1\35\1\70\2\0\1\71"+
    "\2\0\1\72\1\73\4\0\2\4\1\74\4\4\1\75"+
    "\26\4\1\76\11\4\2\0\1\77\1\0\1\100\2\0"+
    "\1\101\5\0\1\4\1\102\1\103\5\4\1\104\2\4"+
    "\1\105\1\106\3\4\1\107\10\4\1\110\1\111\5\4"+
    "\1\112\1\113\2\4\1\114\3\4\1\77\1\70\1\115"+
    "\1\0\1\116\4\0\6\4\1\117\1\120\3\4\1\121"+
    "\7\4\1\122\2\4\1\123\1\124\1\4\1\125\5\4"+
    "\1\126\1\0\1\127\2\0\1\4\1\130\1\4\1\131"+
    "\1\4\1\132\1\4\1\133\1\134\1\135\1\136\1\137"+
    "\1\140\1\141\1\142\1\143\2\4\1\144\1\0\1\4"+
    "\1\145\3\4\1\0\1\146\1\147\1\4\1\150\2\4"+
    "\1\151\1\4\1\0\1\152\1\0\2\4\1\153\1\154"+
    "\1\4\1\155\1\156\1\157\2\0\1\160\2\4\2\0"+
    "\1\161\1\4\2\0\1\4\2\0\1\4\2\0\1\162"+
    "\1\163\1\0\1\164";

  private static int [] zzUnpackAction() {
    int [] result = new int[334];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\77\0\176\0\275\0\374\0\u013b\0\u017a\0\u01b9"+
    "\0\u01f8\0\u0237\0\u0276\0\u02b5\0\u02f4\0\77\0\77\0\u0333"+
    "\0\77\0\77\0\77\0\77\0\77\0\77\0\77\0\u0372"+
    "\0\77\0\u03b1\0\u03f0\0\u042f\0\u046e\0\u04ad\0\77\0\u04ec"+
    "\0\u052b\0\u056a\0\u05a9\0\u05e8\0\u0627\0\u0666\0\u06a5\0\u06e4"+
    "\0\u0723\0\u0762\0\u07a1\0\u07e0\0\u081f\0\u085e\0\u089d\0\u08dc"+
    "\0\u091b\0\u095a\0\u0999\0\u09d8\0\77\0\77\0\u01b9\0\77"+
    "\0\u0a17\0\u0a56\0\u0a95\0\77\0\u0ad4\0\u0b13\0\77\0\77"+
    "\0\77\0\77\0\77\0\77\0\77\0\77\0\77\0\77"+
    "\0\77\0\77\0\77\0\77\0\77\0\77\0\77\0\77"+
    "\0\u0b52\0\u0b91\0\u0bd0\0\u0c0f\0\u0c4e\0\u0c8d\0\u0ccc\0\u0d0b"+
    "\0\u0d4a\0\u0d89\0\u0dc8\0\374\0\u0e07\0\u0e46\0\u0e85\0\u0ec4"+
    "\0\u0f03\0\u0f42\0\u0f81\0\u0fc0\0\u0fff\0\u103e\0\u107d\0\u10bc"+
    "\0\u10fb\0\u113a\0\u1179\0\u11b8\0\u11f7\0\u1236\0\u1275\0\u12b4"+
    "\0\u12f3\0\u1332\0\u1371\0\u13b0\0\u13ef\0\u142e\0\u146d\0\u14ac"+
    "\0\u14eb\0\77\0\u152a\0\u1569\0\u15a8\0\77\0\u15e7\0\u1626"+
    "\0\u1665\0\u16a4\0\u16e3\0\u1722\0\374\0\u1761\0\u17a0\0\u17df"+
    "\0\u181e\0\374\0\u185d\0\u189c\0\u18db\0\u191a\0\u1959\0\u1998"+
    "\0\u19d7\0\u1a16\0\u1a55\0\u1a94\0\u1ad3\0\u1b12\0\u1b51\0\u1b90"+
    "\0\u1bcf\0\u1c0e\0\u1c4d\0\u1c8c\0\u1ccb\0\u1d0a\0\u1d49\0\u1d88"+
    "\0\u1dc7\0\u1e06\0\u1e45\0\u1e84\0\u1ec3\0\u1f02\0\u1f41\0\u1f80"+
    "\0\u1fbf\0\u1ffe\0\u203d\0\u207c\0\u207c\0\u20bb\0\77\0\u20fa"+
    "\0\u2139\0\77\0\u2178\0\u21b7\0\u21f6\0\u2235\0\u2274\0\u22b3"+
    "\0\374\0\374\0\u22f2\0\u2331\0\u2370\0\u23af\0\u23ee\0\374"+
    "\0\u242d\0\u246c\0\374\0\374\0\u24ab\0\u24ea\0\u2529\0\374"+
    "\0\u2568\0\u25a7\0\u25e6\0\u2625\0\u2664\0\u26a3\0\u26e2\0\u2721"+
    "\0\374\0\374\0\u2760\0\u279f\0\u27de\0\u281d\0\u285c\0\374"+
    "\0\374\0\u289b\0\u28da\0\374\0\u2919\0\u2958\0\u2997\0\77"+
    "\0\77\0\77\0\u29d6\0\77\0\u2a15\0\u2a54\0\u2a93\0\u2ad2"+
    "\0\u2b11\0\u2b50\0\u2b8f\0\u2bce\0\u2c0d\0\u2c4c\0\374\0\374"+
    "\0\u2c8b\0\u2cca\0\u2d09\0\374\0\u2d48\0\u2d87\0\u2dc6\0\u2e05"+
    "\0\u2e44\0\u2e83\0\u2ec2\0\374\0\u2f01\0\u2f40\0\374\0\374"+
    "\0\u2f7f\0\u2fbe\0\u2ffd\0\u303c\0\u307b\0\u30ba\0\u30f9\0\77"+
    "\0\u3138\0\77\0\u3177\0\u31b6\0\u31f5\0\374\0\u3234\0\374"+
    "\0\u3273\0\374\0\u32b2\0\374\0\374\0\374\0\374\0\374"+
    "\0\374\0\374\0\374\0\374\0\u32f1\0\u3330\0\374\0\u336f"+
    "\0\u33ae\0\u33ed\0\u342c\0\u346b\0\u34aa\0\u34e9\0\77\0\77"+
    "\0\u3528\0\374\0\u3567\0\u35a6\0\374\0\u35e5\0\u3624\0\374"+
    "\0\u3663\0\u36a2\0\u36e1\0\374\0\77\0\u3720\0\374\0\374"+
    "\0\374\0\u375f\0\u379e\0\374\0\u37dd\0\u381c\0\u385b\0\u389a"+
    "\0\374\0\u38d9\0\u3918\0\u3957\0\u3996\0\u39d5\0\u3a14\0\u3a53"+
    "\0\u3a92\0\u3ad1\0\374\0\77\0\u3b10\0\77";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[334];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\5\1\10"+
    "\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20"+
    "\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30"+
    "\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40"+
    "\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50"+
    "\1\51\3\5\1\52\1\53\1\54\1\5\1\55\2\5"+
    "\1\56\1\57\1\60\1\61\2\5\1\3\1\62\4\5"+
    "\100\0\1\3\67\0\1\3\7\0\1\63\1\0\1\64"+
    "\24\0\1\65\50\0\1\5\1\0\2\5\31\0\31\5"+
    "\1\0\5\5\31\0\1\66\52\0\1\7\71\0\7\67"+
    "\1\70\67\67\10\0\1\71\1\72\1\0\1\73\15\0"+
    "\1\74\56\0\1\75\77\0\1\76\16\0\1\77\60\0"+
    "\1\100\15\0\1\101\62\0\1\102\1\103\1\104\76\0"+
    "\1\105\11\0\1\106\57\0\1\107\14\0\1\110\1\0"+
    "\1\111\76\0\1\112\76\0\1\113\76\0\1\114\1\0"+
    "\1\115\74\0\1\116\76\0\1\117\104\0\1\120\4\0"+
    "\1\121\1\0\1\122\15\0\1\123\1\0\1\124\13\0"+
    "\1\5\1\0\2\5\31\0\1\125\30\5\1\0\5\5"+
    "\3\0\1\5\1\0\2\5\31\0\6\5\1\126\3\5"+
    "\1\127\16\5\1\0\5\5\3\0\1\5\1\0\2\5"+
    "\31\0\3\5\1\130\7\5\1\131\15\5\1\0\5\5"+
    "\3\0\1\5\1\0\2\5\31\0\7\5\1\132\21\5"+
    "\1\0\5\5\3\0\1\5\1\0\2\5\31\0\12\5"+
    "\1\133\3\5\1\134\12\5\1\0\5\5\3\0\1\5"+
    "\1\0\2\5\31\0\3\5\1\135\13\5\1\136\11\5"+
    "\1\0\5\5\3\0\1\5\1\0\2\5\31\0\12\5"+
    "\1\137\16\5\1\0\5\5\3\0\1\5\1\0\2\5"+
    "\31\0\12\5\1\140\5\5\1\141\1\142\7\5\1\0"+
    "\5\5\3\0\1\5\1\0\2\5\31\0\11\5\1\143"+
    "\17\5\1\0\5\5\3\0\1\5\1\0\2\5\31\0"+
    "\2\5\1\144\1\5\1\145\3\5\1\146\1\147\2\5"+
    "\1\150\14\5\1\0\5\5\3\0\1\5\1\0\2\5"+
    "\31\0\1\5\1\151\7\5\1\152\5\5\1\153\11\5"+
    "\1\0\5\5\3\0\1\5\1\0\2\5\31\0\1\5"+
    "\1\154\15\5\1\155\1\156\10\5\1\0\5\5\3\0"+
    "\1\5\1\0\2\5\31\0\17\5\1\157\11\5\1\0"+
    "\5\5\3\0\1\5\1\0\2\5\31\0\17\5\1\160"+
    "\11\5\1\0\5\5\3\0\1\5\1\0\2\5\31\0"+
    "\7\5\1\161\7\5\1\162\11\5\1\0\5\5\3\0"+
    "\1\5\1\0\2\5\31\0\17\5\1\163\11\5\1\0"+
    "\5\5\3\0\1\5\1\0\2\5\31\0\2\5\1\164"+
    "\26\5\1\0\5\5\3\0\1\5\1\0\2\5\31\0"+
    "\31\5\1\0\1\5\1\165\3\5\2\166\1\167\74\166"+
    "\4\170\1\171\72\170\31\0\1\172\56\0\1\173\76\0"+
    "\1\174\76\0\1\175\116\0\1\176\117\0\1\177\76\0"+
    "\1\200\73\0\1\201\72\0\1\202\36\0\1\5\1\0"+
    "\2\5\31\0\1\5\1\203\27\5\1\0\5\5\3\0"+
    "\1\5\1\0\2\5\31\0\2\5\1\204\26\5\1\0"+
    "\5\5\3\0\1\5\1\0\2\5\31\0\13\5\1\205"+
    "\15\5\1\0\5\5\3\0\1\5\1\0\2\5\31\0"+
    "\6\5\1\206\22\5\1\0\5\5\3\0\1\5\1\0"+
    "\2\5\31\0\26\5\1\207\2\5\1\0\5\5\3\0"+
    "\1\5\1\0\2\5\31\0\2\5\1\210\20\5\1\211"+
    "\5\5\1\0\5\5\3\0\1\5\1\0\2\5\31\0"+
    "\2\5\1\212\15\5\1\213\10\5\1\0\5\5\3\0"+
    "\1\5\1\0\2\5\31\0\7\5\1\214\21\5\1\0"+
    "\5\5\3\0\1\5\1\0\2\5\31\0\17\5\1\215"+
    "\11\5\1\0\5\5\3\0\1\5\1\0\2\5\31\0"+
    "\4\5\1\216\7\5\1\217\14\5\1\0\5\5\3\0"+
    "\1\5\1\0\2\5\31\0\6\5\1\220\22\5\1\0"+
    "\5\5\3\0\1\5\1\0\2\5\31\0\14\5\1\221"+
    "\14\5\1\0\5\5\3\0\1\5\1\0\2\5\31\0"+
    "\2\5\1\222\1\5\1\223\24\5\1\0\5\5\3\0"+
    "\1\5\1\0\2\5\31\0\4\5\1\224\2\5\1\225"+
    "\21\5\1\0\5\5\3\0\1\5\1\0\2\5\31\0"+
    "\1\5\1\226\1\5\1\227\25\5\1\0\5\5\3\0"+
    "\1\5\1\0\2\5\31\0\23\5\1\230\4\5\1\231"+
    "\1\0\5\5\3\0\1\5\1\0\2\5\31\0\4\5"+
    "\1\232\24\5\1\0\5\5\3\0\1\5\1\0\2\5"+
    "\31\0\17\5\1\233\11\5\1\0\5\5\3\0\1\5"+
    "\1\0\2\5\31\0\4\5\1\234\24\5\1\0\5\5"+
    "\3\0\1\5\1\0\2\5\31\0\14\5\1\235\14\5"+
    "\1\0\5\5\3\0\1\5\1\0\2\5\31\0\1\5"+
    "\1\236\27\5\1\0\5\5\3\0\1\5\1\0\2\5"+
    "\31\0\12\5\1\237\16\5\1\0\5\5\3\0\1\5"+
    "\1\0\2\5\31\0\20\5\1\240\10\5\1\0\5\5"+
    "\3\0\1\5\1\0\2\5\31\0\3\5\1\241\25\5"+
    "\1\0\5\5\3\0\1\5\1\0\2\5\31\0\17\5"+
    "\1\242\11\5\1\0\5\5\3\0\1\5\1\0\2\5"+
    "\31\0\12\5\1\243\16\5\1\0\5\5\3\0\1\5"+
    "\1\0\2\5\31\0\2\5\1\244\26\5\1\0\5\5"+
    "\3\0\1\5\1\0\2\5\31\0\16\5\1\245\12\5"+
    "\1\0\5\5\3\0\1\5\1\0\2\5\31\0\6\5"+
    "\1\246\22\5\1\0\5\5\3\0\1\5\1\0\2\5"+
    "\31\0\4\5\1\247\13\5\1\250\10\5\1\0\5\5"+
    "\3\0\1\5\1\0\2\5\31\0\3\5\1\251\25\5"+
    "\1\0\5\5\3\0\1\5\1\0\2\5\31\0\31\5"+
    "\1\0\2\5\1\252\2\5\3\166\1\0\73\166\3\167"+
    "\1\0\73\167\4\170\1\253\72\170\2\254\1\255\1\254"+
    "\1\256\72\254\11\0\1\257\76\0\1\260\76\0\1\261"+
    "\1\262\1\263\140\0\1\264\105\0\1\265\70\0\1\266"+
    "\61\0\1\267\40\0\1\5\1\0\2\5\31\0\2\5"+
    "\1\270\26\5\1\0\5\5\3\0\1\5\1\0\2\5"+
    "\31\0\17\5\1\271\11\5\1\0\5\5\3\0\1\5"+
    "\1\0\2\5\31\0\7\5\1\272\21\5\1\0\5\5"+
    "\3\0\1\5\1\0\2\5\31\0\7\5\1\273\21\5"+
    "\1\0\5\5\3\0\1\5\1\0\2\5\31\0\6\5"+
    "\1\274\22\5\1\0\5\5\3\0\1\5\1\0\2\5"+
    "\31\0\4\5\1\275\24\5\1\0\5\5\3\0\1\5"+
    "\1\0\2\5\31\0\4\5\1\276\24\5\1\0\5\5"+
    "\3\0\1\5\1\0\2\5\31\0\1\5\1\277\27\5"+
    "\1\0\5\5\3\0\1\5\1\0\2\5\31\0\20\5"+
    "\1\300\10\5\1\0\5\5\3\0\1\5\1\0\2\5"+
    "\31\0\17\5\1\301\11\5\1\0\5\5\3\0\1\5"+
    "\1\0\2\5\31\0\4\5\1\302\24\5\1\0\5\5"+
    "\3\0\1\5\1\0\2\5\31\0\27\5\1\303\1\5"+
    "\1\0\5\5\3\0\1\5\1\0\2\5\31\0\7\5"+
    "\1\304\21\5\1\0\5\5\3\0\1\5\1\0\2\5"+
    "\31\0\7\5\1\305\21\5\1\0\5\5\3\0\1\5"+
    "\1\0\2\5\31\0\14\5\1\306\14\5\1\0\5\5"+
    "\3\0\1\5\1\0\2\5\31\0\20\5\1\307\10\5"+
    "\1\0\5\5\3\0\1\5\1\0\2\5\31\0\12\5"+
    "\1\310\16\5\1\0\5\5\3\0\1\5\1\0\2\5"+
    "\31\0\2\5\1\311\26\5\1\0\5\5\3\0\1\5"+
    "\1\0\2\5\31\0\4\5\1\312\1\5\1\313\22\5"+
    "\1\0\5\5\3\0\1\5\1\0\2\5\31\0\12\5"+
    "\1\314\16\5\1\0\5\5\3\0\1\5\1\0\2\5"+
    "\31\0\7\5\1\315\21\5\1\0\5\5\3\0\1\5"+
    "\1\0\2\5\31\0\2\5\1\316\26\5\1\0\5\5"+
    "\3\0\1\5\1\0\2\5\31\0\3\5\1\317\25\5"+
    "\1\0\5\5\3\0\1\5\1\0\2\5\31\0\30\5"+
    "\1\320\1\0\5\5\3\0\1\5\1\0\2\5\31\0"+
    "\7\5\1\321\21\5\1\0\5\5\3\0\1\5\1\0"+
    "\2\5\31\0\3\5\1\322\25\5\1\0\5\5\3\0"+
    "\1\5\1\0\2\5\31\0\2\5\1\323\11\5\1\324"+
    "\14\5\1\0\5\5\3\0\1\5\1\0\2\5\31\0"+
    "\14\5\1\325\14\5\1\0\5\5\3\0\1\5\1\0"+
    "\2\5\31\0\1\5\1\326\27\5\1\0\5\5\3\0"+
    "\1\5\1\0\2\5\31\0\1\5\1\327\27\5\1\0"+
    "\5\5\3\0\1\5\1\0\2\5\31\0\23\5\1\330"+
    "\5\5\1\0\5\5\3\0\1\5\1\0\2\5\31\0"+
    "\17\5\1\331\11\5\1\0\5\5\3\0\1\5\1\0"+
    "\2\5\31\0\1\5\1\332\27\5\1\0\5\5\3\0"+
    "\1\5\1\0\2\5\31\0\5\5\1\333\23\5\1\0"+
    "\5\5\3\0\1\5\1\0\2\5\31\0\24\5\1\334"+
    "\4\5\1\0\5\5\3\0\1\5\1\0\2\5\31\0"+
    "\1\5\1\335\27\5\1\0\5\5\3\0\1\5\1\0"+
    "\2\5\31\0\24\5\1\336\4\5\1\0\5\5\3\0"+
    "\1\5\1\0\2\5\31\0\31\5\1\0\3\5\1\337"+
    "\1\5\2\170\1\340\74\170\4\254\1\256\74\254\1\341"+
    "\74\254\11\0\1\342\76\0\1\343\77\0\1\344\144\0"+
    "\1\345\65\0\1\346\73\0\1\347\115\0\1\350\16\0"+
    "\1\5\1\0\2\5\31\0\2\5\1\351\26\5\1\0"+
    "\5\5\3\0\1\5\1\0\2\5\31\0\17\5\1\352"+
    "\4\5\1\353\4\5\1\0\5\5\3\0\1\5\1\0"+
    "\2\5\31\0\3\5\1\354\25\5\1\0\5\5\3\0"+
    "\1\5\1\0\2\5\31\0\14\5\1\355\14\5\1\0"+
    "\5\5\3\0\1\5\1\0\2\5\31\0\12\5\1\356"+
    "\16\5\1\0\5\5\3\0\1\5\1\0\2\5\31\0"+
    "\22\5\1\357\6\5\1\0\5\5\3\0\1\5\1\0"+
    "\2\5\31\0\12\5\1\360\16\5\1\0\5\5\3\0"+
    "\1\5\1\0\2\5\31\0\23\5\1\361\5\5\1\0"+
    "\5\5\3\0\1\5\1\0\2\5\31\0\3\5\1\362"+
    "\25\5\1\0\5\5\3\0\1\5\1\0\2\5\31\0"+
    "\2\5\1\363\26\5\1\0\5\5\3\0\1\5\1\0"+
    "\2\5\31\0\7\5\1\364\21\5\1\0\5\5\3\0"+
    "\1\5\1\0\2\5\31\0\4\5\1\365\24\5\1\0"+
    "\5\5\3\0\1\5\1\0\2\5\31\0\15\5\1\366"+
    "\13\5\1\0\5\5\3\0\1\5\1\0\2\5\31\0"+
    "\15\5\1\367\13\5\1\0\5\5\3\0\1\5\1\0"+
    "\2\5\31\0\7\5\1\370\21\5\1\0\5\5\3\0"+
    "\1\5\1\0\2\5\31\0\1\371\16\5\1\372\11\5"+
    "\1\0\5\5\3\0\1\5\1\0\2\5\31\0\15\5"+
    "\1\373\13\5\1\0\5\5\3\0\1\5\1\0\2\5"+
    "\31\0\2\5\1\374\26\5\1\0\5\5\3\0\1\5"+
    "\1\0\2\5\31\0\7\5\1\375\21\5\1\0\5\5"+
    "\3\0\1\5\1\0\2\5\31\0\4\5\1\376\24\5"+
    "\1\0\5\5\3\0\1\5\1\0\2\5\31\0\2\5"+
    "\1\377\26\5\1\0\5\5\3\0\1\5\1\0\2\5"+
    "\31\0\7\5\1\u0100\21\5\1\0\5\5\3\0\1\5"+
    "\1\0\2\5\31\0\20\5\1\u0101\10\5\1\0\5\5"+
    "\3\0\1\5\1\0\2\5\31\0\2\5\1\u0102\26\5"+
    "\1\0\5\5\3\0\1\5\1\0\2\5\31\0\6\5"+
    "\1\u0103\22\5\1\0\5\5\3\0\1\5\1\0\2\5"+
    "\31\0\20\5\1\u0104\10\5\1\0\5\5\3\0\1\5"+
    "\1\0\2\5\31\0\2\5\1\u0105\26\5\1\0\5\5"+
    "\3\0\1\5\1\0\2\5\31\0\4\5\1\u0106\24\5"+
    "\1\0\5\5\3\0\1\5\1\0\2\5\31\0\31\5"+
    "\1\0\4\5\1\u0107\11\0\1\u0108\133\0\1\u0109\106\0"+
    "\1\u010a\72\0\1\u010b\113\0\1\u010c\12\0\1\5\1\0"+
    "\2\5\31\0\3\5\1\u010d\25\5\1\0\5\5\3\0"+
    "\1\5\1\0\2\5\31\0\16\5\1\u010e\12\5\1\0"+
    "\5\5\3\0\1\5\1\0\2\5\31\0\7\5\1\u010f"+
    "\21\5\1\0\5\5\3\0\1\5\1\0\2\5\31\0"+
    "\12\5\1\u0110\16\5\1\0\5\5\3\0\1\5\1\0"+
    "\2\5\31\0\2\5\1\u0111\26\5\1\0\5\5\3\0"+
    "\1\5\1\0\2\5\31\0\7\5\1\u0112\21\5\1\0"+
    "\5\5\3\0\1\5\1\0\2\5\31\0\12\5\1\u0113"+
    "\16\5\1\0\5\5\3\0\1\5\1\0\2\5\31\0"+
    "\12\5\1\u0114\16\5\1\0\5\5\3\0\1\5\1\0"+
    "\2\5\31\0\14\5\1\u0115\14\5\1\0\5\5\3\0"+
    "\1\5\1\0\2\5\31\0\15\5\1\u0116\13\5\1\0"+
    "\5\5\3\0\1\5\1\0\2\5\31\0\2\5\1\u0117"+
    "\26\5\1\0\5\5\3\0\1\5\1\0\2\5\31\0"+
    "\2\5\1\u0118\26\5\1\0\5\5\3\0\1\5\1\0"+
    "\2\5\31\0\24\5\1\u0119\4\5\1\0\5\5\3\0"+
    "\1\5\1\0\2\5\31\0\2\5\1\u011a\26\5\1\0"+
    "\5\5\3\0\1\5\1\0\2\5\31\0\16\5\1\u011b"+
    "\12\5\1\0\5\5\3\0\1\5\1\0\2\5\31\0"+
    "\11\5\1\u011c\17\5\1\0\5\5\3\0\1\5\1\0"+
    "\2\5\31\0\1\u011d\30\5\1\0\5\5\3\0\1\5"+
    "\1\0\2\5\31\0\12\5\1\u011e\16\5\1\0\5\5"+
    "\3\0\1\5\1\0\2\5\31\0\20\5\1\u011f\10\5"+
    "\1\0\5\5\3\0\1\5\1\0\2\5\31\0\31\5"+
    "\1\u0120\5\5\3\0\1\5\1\0\2\5\31\0\20\5"+
    "\1\u0121\10\5\1\0\5\5\3\0\1\5\1\0\2\5"+
    "\31\0\7\5\1\u0122\21\5\1\0\5\5\3\0\1\5"+
    "\1\0\2\5\31\0\4\5\1\u0123\24\5\1\0\5\5"+
    "\3\0\1\5\1\0\2\5\31\0\16\5\1\u0124\12\5"+
    "\1\0\5\5\3\0\1\5\1\0\2\5\31\0\31\5"+
    "\1\0\3\5\1\u0125\1\5\64\0\1\u0126\61\0\1\u0127"+
    "\70\0\1\u0128\40\0\1\5\1\0\2\5\31\0\4\5"+
    "\1\u0129\24\5\1\0\5\5\3\0\1\5\1\0\2\5"+
    "\31\0\16\5\1\u012a\12\5\1\0\5\5\3\0\1\5"+
    "\1\0\2\5\31\0\7\5\1\u012b\21\5\1\0\5\5"+
    "\3\0\1\5\1\0\2\5\31\0\7\5\1\u012c\21\5"+
    "\1\0\5\5\3\0\1\5\1\0\2\5\31\0\2\5"+
    "\1\u012d\26\5\1\0\5\5\3\0\1\5\1\0\2\5"+
    "\31\0\6\5\1\u012e\22\5\1\0\5\5\55\0\1\u012f"+
    "\24\0\1\5\1\0\2\5\31\0\2\5\1\u0130\26\5"+
    "\1\0\5\5\3\0\1\5\1\0\2\5\31\0\31\5"+
    "\1\u0131\5\5\3\0\1\5\1\0\2\5\31\0\20\5"+
    "\1\u0132\10\5\1\0\5\5\3\0\1\5\1\0\2\5"+
    "\31\0\16\5\1\u0133\12\5\1\0\5\5\3\0\1\u0134"+
    "\1\0\2\5\31\0\31\5\1\0\5\5\47\0\1\u0135"+
    "\32\0\1\5\1\0\2\5\31\0\5\5\1\u0136\23\5"+
    "\1\0\5\5\3\0\1\5\1\0\2\5\31\0\3\5"+
    "\1\u0137\25\5\1\0\5\5\3\0\1\5\1\0\2\5"+
    "\31\0\24\5\1\u0138\4\5\1\0\5\5\3\0\1\5"+
    "\1\0\2\5\31\0\7\5\1\u0139\21\5\1\0\5\5"+
    "\57\0\1\u013a\74\0\1\u013b\24\0\1\5\1\0\2\5"+
    "\31\0\7\5\1\u013c\21\5\1\0\5\5\3\0\1\5"+
    "\1\0\2\5\31\0\1\u013d\30\5\1\0\5\5\3\0"+
    "\1\5\1\0\2\5\31\0\6\5\1\u013e\22\5\1\0"+
    "\5\5\67\0\1\u013f\66\0\1\u0140\22\0\1\5\1\0"+
    "\2\5\31\0\2\5\1\u0141\26\5\1\0\5\5\3\0"+
    "\1\5\1\0\2\5\31\0\2\5\1\u0142\26\5\1\0"+
    "\5\5\66\0\1\u0143\77\0\1\u0144\12\0\1\5\1\0"+
    "\2\5\31\0\7\5\1\u0145\21\5\1\0\5\5\60\0"+
    "\1\u0146\104\0\1\u0147\13\0\1\5\1\0\2\5\31\0"+
    "\1\u0148\30\5\1\0\5\5\47\0\1\u0149\107\0\1\u014a"+
    "\21\0\1\5\1\0\2\5\31\0\1\u014b\30\5\1\0"+
    "\5\5\61\0\1\u014c\64\0\1\u014d\110\0\1\u014e\15\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[15183];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\13\1\2\11\1\1\7\11\1\1\1\11"+
    "\5\1\1\11\24\1\1\0\2\11\1\0\1\11\1\1"+
    "\2\0\1\11\1\0\1\1\22\11\4\0\43\1\2\0"+
    "\1\11\2\0\1\1\1\11\4\0\50\1\2\0\1\1"+
    "\1\0\1\11\2\0\1\11\5\0\50\1\3\11\1\0"+
    "\1\11\4\0\37\1\1\11\1\0\1\11\2\0\23\1"+
    "\1\0\5\1\1\0\2\11\6\1\1\0\1\1\1\0"+
    "\3\1\1\11\4\1\2\0\3\1\2\0\2\1\2\0"+
    "\1\1\2\0\1\1\2\0\1\1\1\11\1\0\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[334];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  public _SmPLCLexer() {
    this((java.io.Reader)null);
  }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public _SmPLCLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    int size = 0;
    for (int i = 0, length = packed.length(); i < length; i += 2) {
      size += packed.charAt(i);
    }
    char[] map = new char[size];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < packed.length()) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + ZZ_CMAP(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return BAD_CHARACTER;
            }
          case 117: break;
          case 2: 
            { return WHITE_SPACE;
            }
          case 118: break;
          case 3: 
            { return DIVIDE;
            }
          case 119: break;
          case 4: 
            { return WORD;
            }
          case 120: break;
          case 5: 
            { return TIMES;
            }
          case 121: break;
          case 6: 
            { return DIGITS;
            }
          case 122: break;
          case 7: 
            { return LT;
            }
          case 123: break;
          case 8: 
            { return DOT;
            }
          case 124: break;
          case 9: 
            { return GT;
            }
          case 125: break;
          case 10: 
            { return PLUS;
            }
          case 126: break;
          case 11: 
            { return LPAREN;
            }
          case 127: break;
          case 12: 
            { return RPAREN;
            }
          case 128: break;
          case 13: 
            { return OR;
            }
          case 129: break;
          case 14: 
            { return LBRACK;
            }
          case 130: break;
          case 15: 
            { return RBRACK;
            }
          case 131: break;
          case 16: 
            { return LBRACE;
            }
          case 132: break;
          case 17: 
            { return RBRACE;
            }
          case 133: break;
          case 18: 
            { return SEMICOLON;
            }
          case 134: break;
          case 19: 
            { return COMMA;
            }
          case 135: break;
          case 20: 
            { return COLON;
            }
          case 136: break;
          case 21: 
            { return MINUS;
            }
          case 137: break;
          case 22: 
            { return QUESTION;
            }
          case 138: break;
          case 23: 
            { return EQUALS;
            }
          case 139: break;
          case 24: 
            { return MOD;
            }
          case 140: break;
          case 25: 
            { return AND;
            }
          case 141: break;
          case 26: 
            { return XOR;
            }
          case 142: break;
          case 27: 
            { return NOT;
            }
          case 143: break;
          case 28: 
            { return TILDE;
            }
          case 144: break;
          case 29: 
            { return LINE_COMMENT;
            }
          case 145: break;
          case 30: 
            { return DIVIDE_EQUALS;
            }
          case 146: break;
          case 31: 
            { return TIMES_EQUALS;
            }
          case 147: break;
          case 32: 
            { return STRING;
            }
          case 148: break;
          case 33: 
            { return LSHIFT;
            }
          case 149: break;
          case 34: 
            { return LE;
            }
          case 150: break;
          case 35: 
            { return RSHIFT;
            }
          case 151: break;
          case 36: 
            { return GE;
            }
          case 152: break;
          case 37: 
            { return INCREMENT;
            }
          case 153: break;
          case 38: 
            { return PLUS_EQUALS;
            }
          case 154: break;
          case 39: 
            { return BACK_LPAREN;
            }
          case 155: break;
          case 40: 
            { return BACK_RPAREN;
            }
          case 156: break;
          case 41: 
            { return BACK_OR;
            }
          case 157: break;
          case 42: 
            { return DOUBLE_OR;
            }
          case 158: break;
          case 43: 
            { return OR_EQUALS;
            }
          case 159: break;
          case 44: 
            { return ARROW;
            }
          case 160: break;
          case 45: 
            { return DECREMENT;
            }
          case 161: break;
          case 46: 
            { return MINUS_EQUALS;
            }
          case 162: break;
          case 47: 
            { return EQ;
            }
          case 163: break;
          case 48: 
            { return MOD_EQUALS;
            }
          case 164: break;
          case 49: 
            { return AND_EQUALS;
            }
          case 165: break;
          case 50: 
            { return DOUBLE_AND;
            }
          case 166: break;
          case 51: 
            { return XOR_EQUALS;
            }
          case 167: break;
          case 52: 
            { return NE;
            }
          case 168: break;
          case 53: 
            { return CONCAT;
            }
          case 169: break;
          case 54: 
            { return IF;
            }
          case 170: break;
          case 55: 
            { return DO;
            }
          case 171: break;
          case 56: 
            { return DOC_COMMENT;
            }
          case 172: break;
          case 57: 
            { return LSHIFT_EQUALS;
            }
          case 173: break;
          case 58: 
            { return ELLIPSIS;
            }
          case 174: break;
          case 59: 
            { return RSHIFT_EQUALS;
            }
          case 175: break;
          case 60: 
            { return ANY;
            }
          case 176: break;
          case 61: 
            { return INT;
            }
          case 177: break;
          case 62: 
            { return FOR;
            }
          case 178: break;
          case 63: 
            { return BLOCK_COMMENT;
            }
          case 179: break;
          case 64: 
            { return NEST_REG_OPEN;
            }
          case 180: break;
          case 65: 
            { return NEST_REG_CLOSE;
            }
          case 181: break;
          case 66: 
            { return AUTO;
            }
          case 182: break;
          case 67: 
            { return TRUE;
            }
          case 183: break;
          case 68: 
            { return BOOL;
            }
          case 184: break;
          case 69: 
            { return ENUM;
            }
          case 185: break;
          case 70: 
            { return ELSE;
            }
          case 186: break;
          case 71: 
            { return WHEN;
            }
          case 187: break;
          case 72: 
            { return CASE;
            }
          case 188: break;
          case 73: 
            { return CHAR;
            }
          case 189: break;
          case 74: 
            { return LONG;
            }
          case 190: break;
          case 75: 
            { return GOTO;
            }
          case 191: break;
          case 76: 
            { return VOID;
            }
          case 192: break;
          case 77: 
            { return NEST_PLUS_OPEN;
            }
          case 193: break;
          case 78: 
            { return NEST_PLUS_CLOSE;
            }
          case 194: break;
          case 79: 
            { return BREAK;
            }
          case 195: break;
          case 80: 
            { return UNION;
            }
          case 196: break;
          case 81: 
            { return WHILE;
            }
          case 197: break;
          case 82: 
            { return SHORT;
            }
          case 198: break;
          case 83: 
            { return CONST;
            }
          case 199: break;
          case 84: 
            { return FALSE;
            }
          case 200: break;
          case 85: 
            { return FLOAT;
            }
          case 201: break;
          case 86: 
            { return DOUBLE_ELLIPSIS;
            }
          case 202: break;
          case 87: 
            { return HASH_UNDEF;
            }
          case 203: break;
          case 88: 
            { return TYPEOF;
            }
          case 204: break;
          case 89: 
            { return RETURN;
            }
          case 205: break;
          case 90: 
            { return INLINE;
            }
          case 206: break;
          case 91: 
            { return EXTERN;
            }
          case 207: break;
          case 92: 
            { return EXISTS;
            }
          case 208: break;
          case 93: 
            { return STATIC;
            }
          case 209: break;
          case 94: 
            { return STRICT;
            }
          case 210: break;
          case 95: 
            { return STRUCT;
            }
          case 211: break;
          case 96: 
            { return SIGNED;
            }
          case 212: break;
          case 97: 
            { return SIZE_T;
            }
          case 213: break;
          case 98: 
            { return SIZEOF;
            }
          case 214: break;
          case 99: 
            { return SWITCH;
            }
          case 215: break;
          case 100: 
            { return FORALL;
            }
          case 216: break;
          case 101: 
            { return DOUBLE;
            }
          case 217: break;
          case 102: 
            { return HASH_DEFINE;
            }
          case 218: break;
          case 103: 
            { return HASH_PRAGMA;
            }
          case 219: break;
          case 104: 
            { return TYPEDEF;
            }
          case 220: break;
          case 105: 
            { return SSIZE_T;
            }
          case 221: break;
          case 106: 
            { return DEFAULT;
            }
          case 222: break;
          case 107: 
            { return INTEGER;
            }
          case 223: break;
          case 108: 
            { return HASH_INCLUDE;
            }
          case 224: break;
          case 109: 
            { return REGISTER;
            }
          case 225: break;
          case 110: 
            { return UNSIGNED;
            }
          case 226: break;
          case 111: 
            { return CONTINUE;
            }
          case 227: break;
          case 112: 
            { return VOLATILE;
            }
          case 228: break;
          case 113: 
            { return PTRDIFF_T;
            }
          case 229: break;
          case 114: 
            { return ATTRIBUTE_HEAD;
            }
          case 230: break;
          case 115: 
            { return FLOAT_COMPLEX;
            }
          case 231: break;
          case 116: 
            { return DOUBLE_COMPLEX;
            }
          case 232: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}

