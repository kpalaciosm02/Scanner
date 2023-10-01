/* The following code was generated by JFlex 1.4.3 on 30/9/23, 20:13 */

package codigo;
import static codigo.Tokens.*;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 30/9/23, 20:13 from the specification file
 * <tt>C:/Users/kenda/OneDrive/Documentos/GitHub/Scanner/Scanner/src/codigo/Lexer.flex</tt>
 */
class Lexer {

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
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\3\1\40\2\0\1\40\22\0\1\3\1\0\1\56\5\0"+
    "\1\47\1\50\1\35\1\44\1\42\1\5\1\54\1\37\1\6\11\2"+
    "\1\53\1\43\1\46\1\41\1\45\2\0\1\7\1\12\1\21\1\24"+
    "\1\4\1\26\1\13\1\23\1\14\1\1\1\31\1\17\1\32\1\15"+
    "\1\16\1\30\1\1\1\10\1\22\1\20\1\27\1\33\1\25\1\55"+
    "\1\11\1\1\1\51\1\0\1\52\1\0\1\1\1\0\1\7\1\12"+
    "\1\21\1\24\1\4\1\26\1\13\1\23\1\14\1\1\1\31\1\17"+
    "\1\32\1\15\1\16\1\30\1\1\1\10\1\22\1\20\1\27\1\33"+
    "\1\25\1\55\1\11\1\1\1\34\1\0\1\36\uff82\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\2\1\5\1\3"+
    "\22\2\1\1\1\6\1\7\1\10\1\11\1\12\1\13"+
    "\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23"+
    "\1\2\1\1\1\0\2\2\1\24\1\25\7\2\2\26"+
    "\2\2\1\27\12\2\1\26\14\2\2\0\1\4\1\30"+
    "\1\4\1\31\1\32\1\33\1\34\1\35\1\36\1\37"+
    "\1\40\1\41\2\42\1\2\1\0\1\43\2\2\1\44"+
    "\7\2\1\45\6\2\1\46\2\2\1\26\4\2\1\47"+
    "\1\0\1\4\1\50\1\51\1\0\1\42\1\52\1\0"+
    "\1\53\15\2\3\0\1\42\12\2";

  private static int [] zzUnpackAction() {
    int [] result = new int[164];
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
    "\0\0\0\57\0\136\0\215\0\274\0\353\0\u011a\0\u0149"+
    "\0\u0178\0\u01a7\0\u01d6\0\u0205\0\u0234\0\u0263\0\u0292\0\u02c1"+
    "\0\u02f0\0\u031f\0\u034e\0\u037d\0\u03ac\0\u03db\0\u040a\0\u0439"+
    "\0\u0468\0\u0497\0\u04c6\0\u04f5\0\u0524\0\57\0\57\0\57"+
    "\0\u0553\0\u0582\0\u05b1\0\57\0\57\0\57\0\57\0\u05e0"+
    "\0\u060f\0\u063e\0\u066d\0\u060f\0\u069c\0\u06cb\0\57\0\57"+
    "\0\u06fa\0\u0729\0\u0758\0\u0787\0\u07b6\0\u07e5\0\u0814\0\u0843"+
    "\0\136\0\u0872\0\u08a1\0\136\0\u08d0\0\u08ff\0\u092e\0\u095d"+
    "\0\u098c\0\u09bb\0\u09ea\0\u0a19\0\u0a48\0\u0a77\0\u0aa6\0\u0ad5"+
    "\0\u0b04\0\u0b33\0\u0b62\0\u0b91\0\u0bc0\0\u0bef\0\u0c1e\0\u0c4d"+
    "\0\u0c7c\0\u0cab\0\u0cda\0\u0d09\0\u0d38\0\57\0\57\0\u0d67"+
    "\0\57\0\57\0\57\0\57\0\u0d96\0\57\0\57\0\u0dc5"+
    "\0\57\0\u0df4\0\u0e23\0\u0e52\0\u0e81\0\57\0\u0eb0\0\u0edf"+
    "\0\136\0\u0f0e\0\u0f3d\0\u0f6c\0\u0f9b\0\u0fca\0\u0ff9\0\u1028"+
    "\0\136\0\u1057\0\u1086\0\u10b5\0\u10e4\0\u1113\0\u1142\0\136"+
    "\0\u1171\0\u11a0\0\u11cf\0\u11fe\0\u122d\0\u125c\0\u128b\0\136"+
    "\0\u12ba\0\u12e9\0\57\0\57\0\u1318\0\u1347\0\136\0\u1376"+
    "\0\57\0\u13a5\0\u13d4\0\u1403\0\u1432\0\u1461\0\u1490\0\u14bf"+
    "\0\u14ee\0\u151d\0\u154c\0\u157b\0\u15aa\0\u15d9\0\u12e9\0\u1608"+
    "\0\u1637\0\57\0\u1666\0\u1695\0\u16c4\0\u16f3\0\u1722\0\u1751"+
    "\0\u1780\0\u17af\0\u17de\0\u180d";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[164];
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
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\1\3\1\13\1\14\1\15\1\16\1\17\1\20"+
    "\1\21\1\22\1\23\1\3\1\24\1\25\1\26\1\27"+
    "\1\30\1\3\1\31\1\32\1\33\1\34\1\2\1\35"+
    "\1\5\1\36\1\37\1\40\1\41\1\42\1\43\1\44"+
    "\1\45\1\46\1\47\1\50\1\51\1\52\1\53\60\0"+
    "\2\3\1\0\1\3\1\0\26\3\21\0\1\3\3\0"+
    "\1\4\3\0\1\4\45\0\1\54\5\0\1\5\34\0"+
    "\1\5\17\0\2\3\1\0\1\3\1\0\7\3\1\55"+
    "\1\3\1\56\14\3\21\0\1\3\6\0\1\57\33\0"+
    "\1\60\71\0\1\54\3\0\2\3\1\0\1\3\1\0"+
    "\2\3\1\61\4\3\1\62\16\3\21\0\1\3\2\0"+
    "\2\3\1\0\1\63\1\0\26\3\21\0\1\3\2\0"+
    "\2\3\1\0\1\64\1\0\3\3\1\65\4\3\1\66"+
    "\15\3\21\0\1\3\2\0\2\3\1\0\1\3\1\0"+
    "\10\3\1\67\15\3\21\0\1\3\2\0\2\3\1\0"+
    "\1\3\1\0\7\3\1\70\10\3\1\71\5\3\21\0"+
    "\1\3\2\0\2\3\1\0\1\3\1\0\6\3\1\72"+
    "\1\3\1\73\15\3\21\0\1\3\2\0\2\3\1\0"+
    "\1\3\1\0\2\3\1\74\15\3\1\71\5\3\21\0"+
    "\1\3\2\0\2\3\1\0\1\3\1\0\1\3\1\75"+
    "\6\3\1\76\15\3\21\0\1\3\2\0\2\3\1\0"+
    "\1\3\1\0\2\3\1\77\1\100\4\3\1\71\4\3"+
    "\1\101\10\3\21\0\1\3\2\0\2\3\1\0\1\3"+
    "\1\0\1\3\1\56\6\3\1\102\4\3\1\32\10\3"+
    "\21\0\1\3\2\0\2\3\1\0\1\103\1\0\12\3"+
    "\1\104\2\3\1\105\10\3\21\0\1\3\2\0\2\3"+
    "\1\0\1\3\1\0\6\3\1\106\1\3\1\107\15\3"+
    "\21\0\1\3\2\0\2\3\1\0\1\3\1\0\2\3"+
    "\1\110\3\3\1\111\6\3\1\112\10\3\21\0\1\3"+
    "\2\0\2\3\1\0\1\3\1\0\1\3\1\113\4\3"+
    "\1\114\1\3\1\115\10\3\1\116\4\3\21\0\1\3"+
    "\2\0\2\3\1\0\1\3\1\0\7\3\1\117\16\3"+
    "\21\0\1\3\2\0\2\3\1\0\1\3\1\0\1\3"+
    "\1\120\1\121\23\3\21\0\1\3\2\0\2\3\1\0"+
    "\1\3\1\0\10\3\1\122\15\3\21\0\1\3\2\0"+
    "\2\3\1\0\1\3\1\0\1\3\1\123\24\3\21\0"+
    "\1\3\1\0\35\124\1\125\1\126\20\124\41\0\1\127"+
    "\54\0\1\130\1\0\1\131\56\0\1\132\2\0\1\133"+
    "\53\0\1\134\3\0\1\135\52\0\1\136\3\0\1\137"+
    "\1\140\51\0\1\141\17\0\1\142\3\0\1\143\51\0"+
    "\2\3\1\0\1\3\1\0\10\3\1\144\15\3\21\0"+
    "\1\3\2\0\2\145\1\0\1\145\1\0\26\145\21\0"+
    "\1\145\1\146\1\0\2\3\1\0\1\3\1\0\16\3"+
    "\1\71\7\3\21\0\1\3\2\0\2\3\1\0\1\3"+
    "\1\0\14\3\1\147\11\3\21\0\1\3\2\0\2\3"+
    "\1\0\1\3\1\0\2\3\1\150\23\3\21\0\1\3"+
    "\2\0\2\3\1\0\1\3\1\0\16\3\1\151\7\3"+
    "\21\0\1\3\2\0\2\3\1\0\1\3\1\0\1\3"+
    "\1\152\11\3\1\153\6\3\1\154\3\3\21\0\1\3"+
    "\2\0\2\3\1\0\1\3\1\0\5\3\1\155\20\3"+
    "\21\0\1\3\2\0\2\3\1\0\1\3\1\0\12\3"+
    "\1\147\13\3\21\0\1\3\2\0\2\3\1\0\1\3"+
    "\1\0\10\3\1\156\15\3\21\0\1\3\2\0\2\3"+
    "\1\0\1\3\1\0\12\3\1\157\13\3\21\0\1\3"+
    "\2\0\2\3\1\0\1\3\1\0\11\3\1\160\1\71"+
    "\13\3\21\0\1\3\2\0\2\3\1\0\1\3\1\0"+
    "\11\3\1\71\14\3\21\0\1\3\2\0\2\3\1\0"+
    "\1\3\1\0\12\3\1\161\13\3\21\0\1\3\2\0"+
    "\2\3\1\0\1\3\1\0\4\3\1\162\21\3\21\0"+
    "\1\3\2\0\2\3\1\0\1\3\1\0\7\3\1\163"+
    "\16\3\21\0\1\3\2\0\2\3\1\0\1\3\1\0"+
    "\21\3\1\147\4\3\21\0\1\3\2\0\2\3\1\0"+
    "\1\3\1\0\22\3\1\147\3\3\21\0\1\3\2\0"+
    "\2\3\1\0\1\164\1\0\26\3\21\0\1\3\2\0"+
    "\2\3\1\0\1\3\1\0\7\3\1\165\16\3\21\0"+
    "\1\3\2\0\2\3\1\0\1\3\1\0\12\3\1\71"+
    "\13\3\21\0\1\3\2\0\2\3\1\0\1\3\1\0"+
    "\2\3\1\166\23\3\21\0\1\3\2\0\2\3\1\0"+
    "\1\3\1\0\10\3\1\167\15\3\21\0\1\3\2\0"+
    "\2\3\1\0\1\3\1\0\25\3\1\170\21\0\1\3"+
    "\2\0\2\3\1\0\1\3\1\0\17\3\1\171\6\3"+
    "\21\0\1\3\2\0\2\3\1\0\1\3\1\0\6\3"+
    "\1\65\17\3\21\0\1\3\2\0\2\3\1\0\1\3"+
    "\1\0\12\3\1\172\13\3\21\0\1\3\2\0\2\3"+
    "\1\0\1\3\1\0\6\3\1\114\17\3\21\0\1\3"+
    "\2\0\2\3\1\0\1\3\1\0\11\3\1\56\14\3"+
    "\21\0\1\3\2\0\2\3\1\0\1\3\1\0\11\3"+
    "\1\147\14\3\21\0\1\3\2\0\2\3\1\0\1\3"+
    "\1\0\2\3\1\173\23\3\21\0\1\3\2\0\2\3"+
    "\1\0\1\3\1\0\7\3\1\174\16\3\21\0\1\3"+
    "\2\0\2\3\1\0\1\3\1\0\12\3\1\175\13\3"+
    "\21\0\1\3\2\0\2\3\1\0\1\3\1\0\13\3"+
    "\1\176\12\3\21\0\1\3\2\0\2\3\1\0\1\3"+
    "\1\0\10\3\1\177\15\3\21\0\1\3\2\0\2\3"+
    "\1\0\1\3\1\0\16\3\1\200\7\3\21\0\1\3"+
    "\2\0\2\3\1\0\1\3\1\0\2\3\1\71\23\3"+
    "\21\0\1\3\1\0\36\124\1\126\20\124\35\125\1\201"+
    "\1\202\20\125\40\130\1\0\16\130\41\0\1\203\56\0"+
    "\1\204\17\0\1\142\1\0\1\205\1\0\1\142\52\0"+
    "\1\206\1\0\1\205\53\0\2\3\1\0\1\3\1\0"+
    "\2\3\1\207\23\3\21\0\1\3\2\0\2\210\1\0"+
    "\1\210\1\0\26\210\21\0\1\210\1\211\1\0\2\3"+
    "\1\0\1\71\1\0\26\3\21\0\1\3\2\0\2\3"+
    "\1\0\1\3\1\0\1\3\1\212\24\3\21\0\1\3"+
    "\2\0\2\3\1\0\1\3\1\0\11\3\1\71\4\3"+
    "\1\71\7\3\21\0\1\3\2\0\2\3\1\0\1\3"+
    "\1\0\10\3\1\213\15\3\21\0\1\3\2\0\2\3"+
    "\1\0\1\214\1\0\26\3\21\0\1\3\2\0\2\3"+
    "\1\0\1\3\1\0\6\3\1\164\17\3\21\0\1\3"+
    "\2\0\2\3\1\0\1\3\1\0\11\3\1\215\14\3"+
    "\21\0\1\3\2\0\2\3\1\0\1\3\1\0\10\3"+
    "\1\71\15\3\21\0\1\3\2\0\2\3\1\0\1\3"+
    "\1\0\6\3\1\216\17\3\21\0\1\3\2\0\2\3"+
    "\1\0\1\72\1\0\26\3\21\0\1\3\2\0\2\3"+
    "\1\0\1\3\1\0\5\3\1\217\20\3\21\0\1\3"+
    "\2\0\2\3\1\0\1\3\1\0\7\3\1\71\16\3"+
    "\21\0\1\3\2\0\2\3\1\0\1\3\1\0\14\3"+
    "\1\103\11\3\21\0\1\3\2\0\2\3\1\0\1\3"+
    "\1\0\6\3\1\220\17\3\21\0\1\3\2\0\2\3"+
    "\1\0\1\3\1\0\2\3\1\221\23\3\21\0\1\3"+
    "\2\0\2\3\1\0\1\3\1\0\7\3\1\67\16\3"+
    "\21\0\1\3\2\0\2\3\1\0\1\3\1\0\15\3"+
    "\1\71\10\3\21\0\1\3\2\0\2\3\1\0\1\3"+
    "\1\0\17\3\1\222\6\3\21\0\1\3\2\0\2\3"+
    "\1\0\1\3\1\0\13\3\1\223\12\3\21\0\1\3"+
    "\2\0\2\3\1\0\1\3\1\0\6\3\1\72\17\3"+
    "\21\0\1\3\2\0\2\3\1\0\1\3\1\0\23\3"+
    "\1\224\2\3\21\0\1\3\2\0\2\3\1\0\1\3"+
    "\1\0\5\3\1\225\5\3\1\226\12\3\21\0\1\3"+
    "\1\0\35\125\1\201\1\126\20\125\35\227\1\230\21\227"+
    "\5\0\1\231\1\232\35\0\1\231\14\0\1\206\3\0"+
    "\1\206\51\0\2\210\1\0\1\210\1\0\26\210\21\0"+
    "\1\210\1\146\1\0\2\3\1\0\1\3\1\0\3\3"+
    "\1\71\22\3\21\0\1\3\2\0\2\3\1\0\1\3"+
    "\1\0\2\3\1\55\23\3\21\0\1\3\2\0\2\3"+
    "\1\0\1\3\1\0\1\3\1\103\24\3\21\0\1\3"+
    "\2\0\2\3\1\0\1\233\1\0\26\3\21\0\1\3"+
    "\2\0\2\3\1\0\1\3\1\0\7\3\1\147\16\3"+
    "\21\0\1\3\2\0\2\3\1\0\1\3\1\0\6\3"+
    "\1\234\17\3\21\0\1\3\2\0\2\3\1\0\1\3"+
    "\1\0\7\3\1\235\16\3\21\0\1\3\2\0\2\3"+
    "\1\0\1\3\1\0\12\3\1\217\13\3\21\0\1\3"+
    "\2\0\2\3\1\0\1\3\1\0\1\3\1\213\24\3"+
    "\21\0\1\3\2\0\2\3\1\0\1\3\1\0\12\3"+
    "\1\236\13\3\21\0\1\3\2\0\2\3\1\0\1\55"+
    "\1\0\26\3\21\0\1\3\2\0\2\3\1\0\1\3"+
    "\1\0\2\3\1\237\23\3\21\0\1\3\2\0\2\3"+
    "\1\0\1\240\1\0\26\3\21\0\1\3\1\0\35\227"+
    "\1\230\1\126\20\227\6\0\1\232\51\0\2\3\1\0"+
    "\1\3\1\0\1\3\1\164\24\3\21\0\1\3\2\0"+
    "\2\3\1\0\1\3\1\0\7\3\1\103\16\3\21\0"+
    "\1\3\2\0\2\3\1\0\1\3\1\0\5\3\1\71"+
    "\20\3\21\0\1\3\2\0\2\3\1\0\1\3\1\0"+
    "\6\3\1\241\17\3\21\0\1\3\2\0\2\3\1\0"+
    "\1\3\1\0\1\3\1\242\24\3\21\0\1\3\2\0"+
    "\2\3\1\0\1\3\1\0\16\3\1\243\7\3\21\0"+
    "\1\3\2\0\2\3\1\0\1\3\1\0\10\3\1\164"+
    "\15\3\21\0\1\3\2\0\2\3\1\0\1\3\1\0"+
    "\24\3\1\71\1\3\21\0\1\3\2\0\2\3\1\0"+
    "\1\3\1\0\21\3\1\244\4\3\21\0\1\3\2\0"+
    "\2\3\1\0\1\3\1\0\2\3\1\147\23\3\21\0"+
    "\1\3\1\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[6204];
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
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\33\1\3\11\3\1\4\11\4\1\1\0"+
    "\2\1\2\11\43\1\2\0\2\11\1\1\4\11\1\1"+
    "\2\11\1\1\1\11\3\1\1\0\1\11\32\1\1\0"+
    "\1\1\2\11\1\0\2\1\1\0\1\11\15\1\3\0"+
    "\1\11\12\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[164];
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
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    public String lexeme;


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  Lexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 176) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
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
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
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
    return zzBuffer[zzStartRead+pos];
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
  public Tokens yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
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
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 40: 
          { lexeme=yytext(); return OperadorDesplazamientoDerechaAsignacion;
          }
        case 44: break;
        case 2: 
          { lexeme=yytext(); return Identificador;
          }
        case 45: break;
        case 24: 
          { lexeme=yytext(); return OperadorMultiplicacionAsignacion;
          }
        case 46: break;
        case 21: 
          { lexeme=yytext(); return OperadorRestaAsignacion;
          }
        case 47: break;
        case 6: 
          { lexeme=yytext(); return OperadorMultiplicacion;
          }
        case 48: break;
        case 30: 
          { lexeme=yytext(); return OperadorMenorOIgualQue;
          }
        case 49: break;
        case 31: 
          { lexeme=yytext(); return OperadorDiferente;
          }
        case 50: break;
        case 13: 
          { lexeme=yytext(); return OperadorMenorQue;
          }
        case 51: break;
        case 18: 
          { lexeme=yytext(); return OperadorDosPuntos;
          }
        case 52: break;
        case 20: 
          { lexeme=yytext(); return OperadorDecremento;
          }
        case 53: break;
        case 35: 
          { lexeme=yytext(); return String;
          }
        case 54: break;
        case 27: 
          { lexeme=yytext(); return OperadorIncremento;
          }
        case 55: break;
        case 14: 
          { lexeme=yytext(); return OperadorParentesisIzquierdo;
          }
        case 56: break;
        case 29: 
          { lexeme=yytext(); return OperadorDesplazamientoDerecha;
          }
        case 57: break;
        case 23: 
          { lexeme=yytext(); return OperadorOr;
          }
        case 58: break;
        case 10: 
          { lexeme=yytext(); return OperadorPuntoYComa;
          }
        case 59: break;
        case 34: 
          { lexeme=yytext(); return Flotante;
          }
        case 60: break;
        case 19: 
          { lexeme=yytext(); return OperadorPunto;
          }
        case 61: break;
        case 5: 
          { lexeme=yytext(); return OperadorResta;
          }
        case 62: break;
        case 22: 
          { lexeme=yytext(); return PalabraReservada;
          }
        case 63: break;
        case 15: 
          { lexeme=yytext(); return OperadorParentesisDerecho;
          }
        case 64: break;
        case 32: 
          { lexeme=yytext(); return OperadorDesplazamientoIzquierda;
          }
        case 65: break;
        case 42: 
          { lexeme=yytext(); return OperadorXor;
          }
        case 66: break;
        case 39: 
          { lexeme=yytext(); return OperadorMod;
          }
        case 67: break;
        case 17: 
          { lexeme=yytext(); return OperadorCorcheteDerecho;
          }
        case 68: break;
        case 16: 
          { lexeme=yytext(); return OperadorCorcheteIzquierdo;
          }
        case 69: break;
        case 41: 
          { lexeme=yytext(); return OperadorDesplazamientoIzquierdaAsignacion;
          }
        case 70: break;
        case 9: 
          { lexeme=yytext(); return OperadorComa;
          }
        case 71: break;
        case 33: 
          { lexeme=yytext(); return OperadorAsignacion;
          }
        case 72: break;
        case 8: 
          { lexeme=yytext(); return OperadorIgual;
          }
        case 73: break;
        case 38: 
          { lexeme=yytext(); return OperadorDiv;
          }
        case 74: break;
        case 11: 
          { lexeme=yytext(); return OperadorSuma;
          }
        case 75: break;
        case 37: 
          { lexeme=yytext(); return OperadorNot;
          }
        case 76: break;
        case 36: 
          { lexeme=yytext(); return OperadorAnd;
          }
        case 77: break;
        case 12: 
          { lexeme=yytext(); return OperadorMayorQue;
          }
        case 78: break;
        case 3: 
          { lexeme=yytext(); return Entero;
          }
        case 79: break;
        case 7: 
          { lexeme=yytext(); return OperadorDivision;
          }
        case 80: break;
        case 43: 
          { lexeme=yytext(); return Caracter;
          }
        case 81: break;
        case 28: 
          { lexeme=yytext(); return OperadorMayorOIgualQue;
          }
        case 82: break;
        case 4: 
          { /*Ignore*/
          }
        case 83: break;
        case 26: 
          { lexeme=yytext(); return OperadorSumaAsignacion;
          }
        case 84: break;
        case 25: 
          { lexeme=yytext(); return OperadorDivisionAsignacion;
          }
        case 85: break;
        case 1: 
          { lexeme=yytext(); return Error;
          }
        case 86: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return null;
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
