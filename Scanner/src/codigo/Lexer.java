/* The following code was generated by JFlex 1.4.3 on 30/9/23, 18:30 */

package codigo;
import static codigo.Tokens.*;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 30/9/23, 18:30 from the specification file
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
    "\11\0\1\35\1\36\2\0\1\35\22\0\1\35\7\0\1\50\1\51"+
    "\1\40\1\45\1\43\1\5\1\55\1\34\1\6\11\2\1\54\1\44"+
    "\1\47\1\42\1\46\2\0\1\7\1\12\1\21\1\24\1\4\1\26"+
    "\1\13\1\23\1\14\1\57\1\31\1\17\1\32\1\15\1\16\1\30"+
    "\1\57\1\10\1\22\1\20\1\27\1\33\1\25\1\56\1\11\1\57"+
    "\1\52\1\0\1\53\1\0\1\1\1\0\1\7\1\12\1\21\1\24"+
    "\1\4\1\26\1\13\1\23\1\14\1\57\1\31\1\17\1\32\1\15"+
    "\1\16\1\30\1\57\1\10\1\22\1\20\1\27\1\33\1\25\1\56"+
    "\1\11\1\57\1\37\1\3\1\41\u1f9e\0\1\60\1\61\udfe2\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\2\23\4"+
    "\1\6\1\1\1\7\1\10\1\11\1\12\1\13\1\14"+
    "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\4"+
    "\1\1\1\0\3\4\1\24\1\25\7\4\2\26\2\4"+
    "\1\27\13\4\1\26\14\4\1\0\1\30\2\0\1\3"+
    "\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40"+
    "\1\41\2\42\1\4\1\0\1\43\1\4\1\26\2\4"+
    "\1\44\7\4\1\45\7\4\1\46\5\4\1\26\4\4"+
    "\1\47\1\0\1\50\1\51\1\0\1\42\1\52\1\0"+
    "\1\53\1\4\1\26\22\4\1\0\1\42\1\4\1\26"+
    "\15\4\1\26\10\4\1\26\4\4\1\26\2\4\1\26"+
    "\166\4";

  private static int [] zzUnpackAction() {
    int [] result = new int[317];
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
    "\0\0\0\62\0\144\0\226\0\310\0\372\0\u012c\0\u015e"+
    "\0\u0190\0\u01c2\0\u01f4\0\u0226\0\u0258\0\u028a\0\u02bc\0\u02ee"+
    "\0\u0320\0\u0352\0\u0384\0\u03b6\0\u03e8\0\u041a\0\u044c\0\u047e"+
    "\0\u04b0\0\u04e2\0\u0514\0\u0546\0\u0578\0\62\0\62\0\62"+
    "\0\u05aa\0\u05dc\0\u060e\0\62\0\62\0\62\0\62\0\u0640"+
    "\0\u0672\0\u06a4\0\u06d6\0\u0672\0\u0708\0\u073a\0\u076c\0\62"+
    "\0\62\0\u079e\0\u07d0\0\u0802\0\u0834\0\u0866\0\u0898\0\u08ca"+
    "\0\u08fc\0\u0708\0\u092e\0\u0960\0\u0708\0\u0992\0\u09c4\0\u09f6"+
    "\0\u0a28\0\u0a5a\0\u0a8c\0\u0abe\0\u0af0\0\u0b22\0\u0b54\0\u0b86"+
    "\0\u0bb8\0\u0bea\0\u0c1c\0\u0c4e\0\u0c80\0\u0cb2\0\u0ce4\0\u0d16"+
    "\0\u0d48\0\u0d7a\0\u0dac\0\u0dde\0\u0e10\0\u0e42\0\62\0\u0e74"+
    "\0\u0ea6\0\62\0\62\0\62\0\62\0\62\0\u0ed8\0\62"+
    "\0\62\0\u0f0a\0\62\0\u0f3c\0\u0f6e\0\u0fa0\0\u0fd2\0\62"+
    "\0\u1004\0\u1004\0\u1036\0\u1068\0\u1004\0\u109a\0\u10cc\0\u10fe"+
    "\0\u1130\0\u1162\0\u1194\0\u11c6\0\u1004\0\u11f8\0\u122a\0\u125c"+
    "\0\u128e\0\u12c0\0\u12f2\0\u1324\0\u1004\0\u1356\0\u1388\0\u13ba"+
    "\0\u13ec\0\u141e\0\u1450\0\u1482\0\u14b4\0\u14e6\0\u1518\0\u1004"+
    "\0\u154a\0\62\0\62\0\u157c\0\u15ae\0\u1004\0\u15e0\0\62"+
    "\0\u1612\0\u1612\0\u1644\0\u1676\0\u16a8\0\u16da\0\u170c\0\u173e"+
    "\0\u1770\0\u17a2\0\u17d4\0\u1806\0\u1838\0\u186a\0\u189c\0\u18ce"+
    "\0\u1900\0\u1932\0\u1964\0\u1996\0\u19c8\0\62\0\u19fa\0\u19fa"+
    "\0\u1a2c\0\u1a5e\0\u1a90\0\u1ac2\0\u1af4\0\u1b26\0\u1b58\0\u1b8a"+
    "\0\u1bbc\0\u1bee\0\u1c20\0\u1c52\0\u1c84\0\u1c84\0\u1cb6\0\u1ce8"+
    "\0\u1d1a\0\u1d4c\0\u1d7e\0\u1db0\0\u1de2\0\u1e14\0\u1e14\0\u1e46"+
    "\0\u1e78\0\u1eaa\0\u1edc\0\u1edc\0\u1f0e\0\u1f40\0\u1f40\0\u1f72"+
    "\0\u1fa4\0\u1fd6\0\u2008\0\u203a\0\u206c\0\u209e\0\u20d0\0\u2102"+
    "\0\u2134\0\u2166\0\u2198\0\u21ca\0\u21fc\0\u222e\0\u2260\0\u2292"+
    "\0\u22c4\0\u22f6\0\u2328\0\u235a\0\u238c\0\u23be\0\u23f0\0\u2422"+
    "\0\u2454\0\u2486\0\u24b8\0\u24ea\0\u251c\0\u254e\0\u2580\0\u25b2"+
    "\0\u25e4\0\u2616\0\u2648\0\u267a\0\u26ac\0\u26de\0\u2710\0\u2742"+
    "\0\u2774\0\u27a6\0\u27d8\0\u280a\0\u283c\0\u286e\0\u28a0\0\u28d2"+
    "\0\u2904\0\u2936\0\u2968\0\u299a\0\u29cc\0\u29fe\0\u2a30\0\u2a62"+
    "\0\u2a94\0\u2ac6\0\u2af8\0\u2b2a\0\u2b5c\0\u2b8e\0\u2bc0\0\u2bf2"+
    "\0\u2c24\0\u2c56\0\u2c88\0\u2cba\0\u2cec\0\u2d1e\0\u2d50\0\u2d82"+
    "\0\u2db4\0\u2de6\0\u2e18\0\u2e4a\0\u2e7c\0\u2eae\0\u2ee0\0\u2f12"+
    "\0\u2f44\0\u2f76\0\u2fa8\0\u2fda\0\u300c\0\u303e\0\u3070\0\u30a2"+
    "\0\u30d4\0\u3106\0\u3138\0\u316a\0\u319c\0\u31ce\0\u3200\0\u3232"+
    "\0\u3264\0\u3296\0\u32c8\0\u32fa\0\u332c\0\u335e\0\u3390\0\u33c2"+
    "\0\u33f4\0\u3426\0\u3458\0\u348a\0\u34bc\0\u34ee\0\u3520\0\u3552"+
    "\0\u3584\0\u35b6\0\u35e8\0\u361a\0\62";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[317];
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
    "\2\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21"+
    "\1\22\1\23\1\12\1\24\1\25\1\26\1\27\1\30"+
    "\1\12\1\31\1\32\1\33\2\4\1\34\1\35\1\2"+
    "\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45"+
    "\1\46\1\47\1\50\1\51\1\52\1\12\1\53\1\2"+
    "\64\0\1\3\3\0\1\3\46\0\1\54\7\0\1\4"+
    "\31\0\2\4\24\0\2\55\1\0\1\55\1\0\7\55"+
    "\1\56\1\55\1\57\14\55\22\0\2\55\7\0\1\60"+
    "\34\0\1\61\74\0\1\54\5\0\2\55\1\0\1\55"+
    "\1\0\2\55\1\62\4\55\1\63\16\55\22\0\2\55"+
    "\3\0\2\55\1\0\1\64\1\0\26\55\22\0\2\55"+
    "\3\0\2\55\1\0\1\55\1\0\26\55\22\0\2\55"+
    "\3\0\2\55\1\0\1\65\1\0\3\55\1\66\4\55"+
    "\1\67\15\55\22\0\2\55\3\0\2\55\1\0\1\55"+
    "\1\0\10\55\1\70\15\55\22\0\2\55\3\0\2\55"+
    "\1\0\1\55\1\0\7\55\1\71\10\55\1\72\5\55"+
    "\22\0\2\55\3\0\2\55\1\0\1\55\1\0\6\55"+
    "\1\73\1\55\1\74\15\55\22\0\2\55\3\0\2\55"+
    "\1\0\1\55\1\0\2\55\1\75\15\55\1\72\5\55"+
    "\22\0\2\55\3\0\2\55\1\0\1\55\1\0\1\55"+
    "\1\76\6\55\1\77\15\55\22\0\2\55\3\0\2\55"+
    "\1\0\1\55\1\0\2\55\1\100\1\101\4\55\1\72"+
    "\4\55\1\102\10\55\22\0\2\55\3\0\2\55\1\0"+
    "\1\55\1\0\1\55\1\57\6\55\1\103\4\55\1\104"+
    "\10\55\22\0\2\55\3\0\2\55\1\0\1\105\1\0"+
    "\12\55\1\106\2\55\1\107\10\55\22\0\2\55\3\0"+
    "\2\55\1\0\1\55\1\0\6\55\1\110\1\55\1\111"+
    "\15\55\22\0\2\55\3\0\2\55\1\0\1\55\1\0"+
    "\2\55\1\112\3\55\1\113\6\55\1\114\10\55\22\0"+
    "\2\55\3\0\2\55\1\0\1\55\1\0\1\55\1\115"+
    "\4\55\1\116\1\55\1\117\10\55\1\120\4\55\22\0"+
    "\2\55\3\0\2\55\1\0\1\55\1\0\7\55\1\121"+
    "\16\55\22\0\2\55\3\0\2\55\1\0\1\55\1\0"+
    "\1\55\1\122\1\123\23\55\22\0\2\55\3\0\2\55"+
    "\1\0\1\55\1\0\10\55\1\124\15\55\22\0\2\55"+
    "\3\0\2\55\1\0\1\55\1\0\1\55\1\125\24\55"+
    "\22\0\2\55\36\0\1\126\5\0\1\127\20\0\2\130"+
    "\1\0\1\130\1\0\26\130\4\0\1\131\1\132\14\0"+
    "\2\130\44\0\1\133\61\0\1\134\2\0\1\135\56\0"+
    "\1\136\3\0\1\137\55\0\1\140\3\0\1\141\1\142"+
    "\54\0\1\143\21\0\1\144\3\0\1\145\54\0\2\55"+
    "\1\0\1\55\1\0\10\55\1\146\15\55\22\0\2\55"+
    "\3\0\2\147\1\0\1\147\1\0\26\147\22\0\2\147"+
    "\1\0\1\150\1\0\2\151\1\0\1\151\1\0\26\151"+
    "\22\0\2\151\3\0\2\151\1\0\1\151\1\0\16\151"+
    "\1\152\7\151\22\0\2\151\3\0\2\151\1\0\1\151"+
    "\1\0\14\151\1\153\11\151\22\0\2\151\3\0\2\151"+
    "\1\0\1\151\1\0\2\151\1\154\23\151\22\0\2\151"+
    "\3\0\2\151\1\0\1\151\1\0\16\151\1\155\7\151"+
    "\22\0\2\151\3\0\2\151\1\0\1\151\1\0\1\151"+
    "\1\156\11\151\1\157\6\151\1\160\3\151\22\0\2\151"+
    "\3\0\2\151\1\0\1\151\1\0\5\151\1\161\20\151"+
    "\22\0\2\151\3\0\2\151\1\0\1\151\1\0\12\151"+
    "\1\153\13\151\22\0\2\151\3\0\2\151\1\0\1\151"+
    "\1\0\10\151\1\162\15\151\22\0\2\151\3\0\2\151"+
    "\1\0\1\151\1\0\12\151\1\163\13\151\22\0\2\151"+
    "\3\0\2\151\1\0\1\151\1\0\11\151\1\164\1\152"+
    "\13\151\22\0\2\151\3\0\2\151\1\0\1\151\1\0"+
    "\11\151\1\152\14\151\22\0\2\151\3\0\2\151\1\0"+
    "\1\151\1\0\12\151\1\165\13\151\22\0\2\151\3\0"+
    "\2\151\1\0\1\151\1\0\4\151\1\166\21\151\22\0"+
    "\2\151\3\0\2\151\1\0\1\151\1\0\7\151\1\167"+
    "\16\151\22\0\2\151\3\0\2\151\1\0\1\151\1\0"+
    "\21\151\1\153\4\151\22\0\2\151\3\0\2\151\1\0"+
    "\1\151\1\0\22\151\1\153\3\151\22\0\2\151\3\0"+
    "\2\151\1\0\1\170\1\0\26\151\22\0\2\151\3\0"+
    "\2\151\1\0\1\151\1\0\7\151\1\171\16\151\22\0"+
    "\2\151\3\0\2\151\1\0\1\151\1\0\1\151\1\172"+
    "\24\151\22\0\2\151\3\0\2\151\1\0\1\151\1\0"+
    "\12\151\1\152\13\151\22\0\2\151\3\0\2\151\1\0"+
    "\1\151\1\0\2\151\1\173\23\151\22\0\2\151\3\0"+
    "\2\151\1\0\1\151\1\0\10\151\1\174\15\151\22\0"+
    "\2\151\3\0\2\151\1\0\1\151\1\0\25\151\1\175"+
    "\22\0\2\151\3\0\2\151\1\0\1\151\1\0\17\151"+
    "\1\176\6\151\22\0\2\151\3\0\2\151\1\0\1\151"+
    "\1\0\6\151\1\177\17\151\22\0\2\151\3\0\2\151"+
    "\1\0\1\151\1\0\12\151\1\200\13\151\22\0\2\151"+
    "\3\0\2\151\1\0\1\151\1\0\6\151\1\201\17\151"+
    "\22\0\2\151\3\0\2\151\1\0\1\151\1\0\11\151"+
    "\1\202\14\151\22\0\2\151\3\0\2\151\1\0\1\151"+
    "\1\0\11\151\1\153\14\151\22\0\2\151\3\0\2\151"+
    "\1\0\1\151\1\0\2\151\1\203\23\151\22\0\2\151"+
    "\3\0\2\151\1\0\1\151\1\0\7\151\1\204\16\151"+
    "\22\0\2\151\3\0\2\151\1\0\1\151\1\0\12\151"+
    "\1\205\13\151\22\0\2\151\3\0\2\151\1\0\1\151"+
    "\1\0\13\151\1\206\12\151\22\0\2\151\3\0\2\151"+
    "\1\0\1\151\1\0\10\151\1\207\15\151\22\0\2\151"+
    "\3\0\2\151\1\0\1\151\1\0\16\151\1\210\7\151"+
    "\22\0\2\151\3\0\2\151\1\0\1\151\1\0\2\151"+
    "\1\152\23\151\22\0\2\151\3\0\2\126\1\0\1\126"+
    "\1\0\26\126\1\0\1\126\1\132\17\0\2\126\3\0"+
    "\2\130\1\0\1\130\1\0\26\130\5\0\1\132\14\0"+
    "\2\130\3\0\2\131\1\0\1\131\1\0\26\131\4\0"+
    "\1\211\15\0\2\131\44\0\1\212\61\0\1\213\21\0"+
    "\1\144\1\0\1\214\1\0\1\144\55\0\1\215\1\0"+
    "\1\214\56\0\2\151\1\0\1\151\1\0\2\151\1\216"+
    "\23\151\22\0\2\151\3\0\2\217\1\0\1\217\1\0"+
    "\26\217\22\0\2\217\1\0\1\220\1\0\2\221\1\0"+
    "\1\221\1\0\26\221\22\0\2\221\3\0\2\221\1\0"+
    "\1\222\1\0\26\221\22\0\2\221\3\0\2\221\1\0"+
    "\1\221\1\0\1\221\1\223\24\221\22\0\2\221\3\0"+
    "\2\221\1\0\1\221\1\0\11\221\1\222\4\221\1\222"+
    "\7\221\22\0\2\221\3\0\2\221\1\0\1\221\1\0"+
    "\10\221\1\224\15\221\22\0\2\221\3\0\2\221\1\0"+
    "\1\225\1\0\26\221\22\0\2\221\3\0\2\221\1\0"+
    "\1\221\1\0\6\221\1\226\17\221\22\0\2\221\3\0"+
    "\2\221\1\0\1\221\1\0\11\221\1\227\14\221\22\0"+
    "\2\221\3\0\2\221\1\0\1\221\1\0\10\221\1\222"+
    "\15\221\22\0\2\221\3\0\2\221\1\0\1\221\1\0"+
    "\6\221\1\230\17\221\22\0\2\221\3\0\2\221\1\0"+
    "\1\231\1\0\26\221\22\0\2\221\3\0\2\221\1\0"+
    "\1\221\1\0\5\221\1\232\20\221\22\0\2\221\3\0"+
    "\2\221\1\0\1\221\1\0\7\221\1\222\16\221\22\0"+
    "\2\221\3\0\2\221\1\0\1\221\1\0\14\221\1\233"+
    "\11\221\22\0\2\221\3\0\2\221\1\0\1\221\1\0"+
    "\2\221\1\222\23\221\22\0\2\221\3\0\2\221\1\0"+
    "\1\221\1\0\6\221\1\234\17\221\22\0\2\221\3\0"+
    "\2\221\1\0\1\221\1\0\2\221\1\235\23\221\22\0"+
    "\2\221\3\0\2\221\1\0\1\221\1\0\7\221\1\236"+
    "\16\221\22\0\2\221\3\0\2\221\1\0\1\221\1\0"+
    "\12\221\1\237\13\221\22\0\2\221\3\0\2\221\1\0"+
    "\1\221\1\0\15\221\1\222\10\221\22\0\2\221\3\0"+
    "\2\221\1\0\1\221\1\0\11\221\1\237\14\221\22\0"+
    "\2\221\3\0\2\221\1\0\1\221\1\0\14\221\1\237"+
    "\11\221\22\0\2\221\3\0\2\221\1\0\1\221\1\0"+
    "\17\221\1\240\6\221\22\0\2\221\3\0\2\221\1\0"+
    "\1\221\1\0\13\221\1\241\12\221\22\0\2\221\3\0"+
    "\2\221\1\0\1\221\1\0\6\221\1\231\17\221\22\0"+
    "\2\221\3\0\2\221\1\0\1\221\1\0\23\221\1\242"+
    "\2\221\22\0\2\221\3\0\2\221\1\0\1\221\1\0"+
    "\5\221\1\243\5\221\1\244\12\221\22\0\2\221\43\0"+
    "\1\132\25\0\1\245\1\246\36\0\1\245\16\0\1\215"+
    "\3\0\1\215\54\0\2\217\1\0\1\217\1\0\26\217"+
    "\22\0\2\217\1\0\1\150\1\0\2\247\1\0\1\247"+
    "\1\0\26\247\22\0\2\247\3\0\2\247\1\0\1\247"+
    "\1\0\3\247\1\250\22\247\22\0\2\247\3\0\2\247"+
    "\1\0\1\247\1\0\2\247\1\251\23\247\22\0\2\247"+
    "\3\0\2\247\1\0\1\247\1\0\1\247\1\252\24\247"+
    "\22\0\2\247\3\0\2\247\1\0\1\247\1\0\7\247"+
    "\1\250\16\247\22\0\2\247\3\0\2\247\1\0\1\253"+
    "\1\0\26\247\22\0\2\247\3\0\2\247\1\0\1\247"+
    "\1\0\7\247\1\254\16\247\22\0\2\247\3\0\2\247"+
    "\1\0\1\247\1\0\11\247\1\250\14\247\22\0\2\247"+
    "\3\0\2\247\1\0\1\247\1\0\6\247\1\255\17\247"+
    "\22\0\2\247\3\0\2\247\1\0\1\247\1\0\12\247"+
    "\1\250\13\247\22\0\2\247\3\0\2\247\1\0\1\247"+
    "\1\0\7\247\1\256\16\247\22\0\2\247\3\0\2\247"+
    "\1\0\1\247\1\0\12\247\1\257\13\247\22\0\2\247"+
    "\3\0\2\247\1\0\1\247\1\0\12\247\1\260\13\247"+
    "\22\0\2\247\3\0\2\247\1\0\1\250\1\0\26\247"+
    "\22\0\2\247\3\0\2\247\1\0\1\247\1\0\1\247"+
    "\1\261\24\247\22\0\2\247\3\0\2\247\1\0\1\247"+
    "\1\0\12\247\1\262\13\247\22\0\2\247\3\0\2\247"+
    "\1\0\1\251\1\0\26\247\22\0\2\247\3\0\2\247"+
    "\1\0\1\247\1\0\2\247\1\263\23\247\22\0\2\247"+
    "\3\0\2\247\1\0\1\264\1\0\26\247\22\0\2\247"+
    "\10\0\1\246\54\0\2\265\1\0\1\265\1\0\26\265"+
    "\22\0\2\265\3\0\2\265\1\0\1\265\1\0\16\265"+
    "\1\266\7\265\22\0\2\265\3\0\2\265\1\0\1\265"+
    "\1\0\12\265\1\266\13\265\22\0\2\265\3\0\2\265"+
    "\1\0\1\265\1\0\1\265\1\267\24\265\22\0\2\265"+
    "\3\0\2\265\1\0\1\266\1\0\26\265\22\0\2\265"+
    "\3\0\2\265\1\0\1\265\1\0\7\265\1\270\16\265"+
    "\22\0\2\265\3\0\2\265\1\0\1\265\1\0\5\265"+
    "\1\266\20\265\22\0\2\265\3\0\2\265\1\0\1\265"+
    "\1\0\6\265\1\271\17\265\22\0\2\265\3\0\2\265"+
    "\1\0\1\265\1\0\10\265\1\266\15\265\22\0\2\265"+
    "\3\0\2\265\1\0\1\265\1\0\2\265\1\272\23\265"+
    "\22\0\2\265\3\0\2\265\1\0\1\265\1\0\6\265"+
    "\1\273\17\265\22\0\2\265\3\0\2\265\1\0\1\265"+
    "\1\0\1\265\1\274\24\265\22\0\2\265\3\0\2\265"+
    "\1\0\1\265\1\0\16\265\1\275\7\265\22\0\2\265"+
    "\3\0\2\276\1\0\1\276\1\0\26\276\22\0\2\276"+
    "\3\0\2\276\1\0\1\276\1\0\7\276\1\277\16\276"+
    "\22\0\2\276\3\0\2\276\1\0\1\276\1\0\12\276"+
    "\1\277\13\276\22\0\2\276\3\0\2\276\1\0\1\276"+
    "\1\0\7\276\1\300\16\276\22\0\2\276\3\0\2\276"+
    "\1\0\1\276\1\0\16\276\1\277\7\276\22\0\2\276"+
    "\3\0\2\276\1\0\1\276\1\0\10\276\1\301\15\276"+
    "\22\0\2\276\3\0\2\276\1\0\1\276\1\0\24\276"+
    "\1\277\1\276\22\0\2\276\3\0\2\276\1\0\1\276"+
    "\1\0\21\276\1\302\4\276\22\0\2\276\3\0\2\303"+
    "\1\0\1\303\1\0\26\303\22\0\2\303\3\0\2\303"+
    "\1\0\1\303\1\0\12\303\1\304\13\303\22\0\2\303"+
    "\3\0\2\303\1\0\1\303\1\0\7\303\1\304\16\303"+
    "\22\0\2\303\3\0\2\303\1\0\1\303\1\0\2\303"+
    "\1\305\23\303\22\0\2\303\3\0\2\306\1\0\1\306"+
    "\1\0\26\306\22\0\2\306\3\0\2\306\1\0\1\307"+
    "\1\0\26\306\22\0\2\306\3\0\2\310\1\0\1\310"+
    "\1\0\26\310\22\0\2\310\3\0\2\311\1\0\1\311"+
    "\1\0\26\311\22\0\2\311\3\0\2\312\1\0\1\312"+
    "\1\0\26\312\22\0\2\312\3\0\2\313\1\0\1\313"+
    "\1\0\26\313\22\0\2\313\3\0\2\314\1\0\1\314"+
    "\1\0\26\314\22\0\2\314\3\0\2\315\1\0\1\315"+
    "\1\0\26\315\22\0\2\315\3\0\2\316\1\0\1\316"+
    "\1\0\26\316\22\0\2\316\3\0\2\317\1\0\1\317"+
    "\1\0\26\317\22\0\2\317\3\0\2\320\1\0\1\320"+
    "\1\0\26\320\22\0\2\320\3\0\2\321\1\0\1\321"+
    "\1\0\26\321\22\0\2\321\3\0\2\322\1\0\1\322"+
    "\1\0\26\322\22\0\2\322\3\0\2\323\1\0\1\323"+
    "\1\0\26\323\22\0\2\323\3\0\2\324\1\0\1\324"+
    "\1\0\26\324\22\0\2\324\3\0\2\325\1\0\1\325"+
    "\1\0\26\325\22\0\2\325\3\0\2\326\1\0\1\326"+
    "\1\0\26\326\22\0\2\326\3\0\2\327\1\0\1\327"+
    "\1\0\26\327\22\0\2\327\3\0\2\330\1\0\1\330"+
    "\1\0\26\330\22\0\2\330\3\0\2\331\1\0\1\331"+
    "\1\0\26\331\22\0\2\331\3\0\2\332\1\0\1\332"+
    "\1\0\26\332\22\0\2\332\3\0\2\333\1\0\1\333"+
    "\1\0\26\333\22\0\2\333\3\0\2\334\1\0\1\334"+
    "\1\0\26\334\22\0\2\334\3\0\2\335\1\0\1\335"+
    "\1\0\26\335\22\0\2\335\3\0\2\336\1\0\1\336"+
    "\1\0\26\336\22\0\2\336\3\0\2\337\1\0\1\337"+
    "\1\0\26\337\22\0\2\337\3\0\2\340\1\0\1\340"+
    "\1\0\26\340\22\0\2\340\3\0\2\341\1\0\1\341"+
    "\1\0\26\341\22\0\2\341\3\0\2\342\1\0\1\342"+
    "\1\0\26\342\22\0\2\342\3\0\2\343\1\0\1\343"+
    "\1\0\26\343\22\0\2\343\3\0\2\344\1\0\1\344"+
    "\1\0\26\344\22\0\2\344\3\0\2\345\1\0\1\345"+
    "\1\0\26\345\22\0\2\345\3\0\2\346\1\0\1\346"+
    "\1\0\26\346\22\0\2\346\3\0\2\347\1\0\1\347"+
    "\1\0\26\347\22\0\2\347\3\0\2\350\1\0\1\350"+
    "\1\0\26\350\22\0\2\350\3\0\2\351\1\0\1\351"+
    "\1\0\26\351\22\0\2\351\3\0\2\352\1\0\1\352"+
    "\1\0\26\352\22\0\2\352\3\0\2\353\1\0\1\353"+
    "\1\0\26\353\22\0\2\353\3\0\2\354\1\0\1\354"+
    "\1\0\26\354\22\0\2\354\3\0\2\355\1\0\1\355"+
    "\1\0\26\355\22\0\2\355\3\0\2\356\1\0\1\356"+
    "\1\0\26\356\22\0\2\356\3\0\2\357\1\0\1\357"+
    "\1\0\26\357\22\0\2\357\3\0\2\360\1\0\1\360"+
    "\1\0\26\360\22\0\2\360\3\0\2\361\1\0\1\361"+
    "\1\0\26\361\22\0\2\361\3\0\2\362\1\0\1\362"+
    "\1\0\26\362\22\0\2\362\3\0\2\363\1\0\1\363"+
    "\1\0\26\363\22\0\2\363\3\0\2\364\1\0\1\364"+
    "\1\0\26\364\22\0\2\364\3\0\2\365\1\0\1\365"+
    "\1\0\26\365\22\0\2\365\3\0\2\366\1\0\1\366"+
    "\1\0\26\366\22\0\2\366\3\0\2\367\1\0\1\367"+
    "\1\0\26\367\22\0\2\367\3\0\2\370\1\0\1\370"+
    "\1\0\26\370\22\0\2\370\3\0\2\371\1\0\1\371"+
    "\1\0\26\371\22\0\2\371\3\0\2\372\1\0\1\372"+
    "\1\0\26\372\22\0\2\372\3\0\2\373\1\0\1\373"+
    "\1\0\26\373\22\0\2\373\3\0\2\374\1\0\1\374"+
    "\1\0\26\374\22\0\2\374\3\0\2\375\1\0\1\375"+
    "\1\0\26\375\22\0\2\375\3\0\2\376\1\0\1\376"+
    "\1\0\26\376\22\0\2\376\3\0\2\377\1\0\1\377"+
    "\1\0\26\377\22\0\2\377\3\0\2\u0100\1\0\1\u0100"+
    "\1\0\26\u0100\22\0\2\u0100\3\0\2\u0101\1\0\1\u0101"+
    "\1\0\26\u0101\22\0\2\u0101\3\0\2\u0102\1\0\1\u0102"+
    "\1\0\26\u0102\22\0\2\u0102\3\0\2\u0103\1\0\1\u0103"+
    "\1\0\26\u0103\22\0\2\u0103\3\0\2\u0104\1\0\1\u0104"+
    "\1\0\26\u0104\22\0\2\u0104\3\0\2\u0105\1\0\1\u0105"+
    "\1\0\26\u0105\22\0\2\u0105\3\0\2\u0106\1\0\1\u0106"+
    "\1\0\26\u0106\22\0\2\u0106\3\0\2\u0107\1\0\1\u0107"+
    "\1\0\26\u0107\22\0\2\u0107\3\0\2\u0108\1\0\1\u0108"+
    "\1\0\26\u0108\22\0\2\u0108\3\0\2\u0109\1\0\1\u0109"+
    "\1\0\26\u0109\22\0\2\u0109\3\0\2\u010a\1\0\1\u010a"+
    "\1\0\26\u010a\22\0\2\u010a\3\0\2\u010b\1\0\1\u010b"+
    "\1\0\26\u010b\22\0\2\u010b\3\0\2\u010c\1\0\1\u010c"+
    "\1\0\26\u010c\22\0\2\u010c\3\0\2\u010d\1\0\1\u010d"+
    "\1\0\26\u010d\22\0\2\u010d\3\0\2\u010e\1\0\1\u010e"+
    "\1\0\26\u010e\22\0\2\u010e\3\0\2\u010f\1\0\1\u010f"+
    "\1\0\26\u010f\22\0\2\u010f\3\0\2\u0110\1\0\1\u0110"+
    "\1\0\26\u0110\22\0\2\u0110\3\0\2\u0111\1\0\1\u0111"+
    "\1\0\26\u0111\22\0\2\u0111\3\0\2\u0112\1\0\1\u0112"+
    "\1\0\26\u0112\22\0\2\u0112\3\0\2\u0113\1\0\1\u0113"+
    "\1\0\26\u0113\22\0\2\u0113\3\0\2\u0114\1\0\1\u0114"+
    "\1\0\26\u0114\22\0\2\u0114\3\0\2\u0115\1\0\1\u0115"+
    "\1\0\26\u0115\22\0\2\u0115\3\0\2\u0116\1\0\1\u0116"+
    "\1\0\26\u0116\22\0\2\u0116\3\0\2\u0117\1\0\1\u0117"+
    "\1\0\26\u0117\22\0\2\u0117\3\0\2\u0118\1\0\1\u0118"+
    "\1\0\26\u0118\22\0\2\u0118\3\0\2\u0119\1\0\1\u0119"+
    "\1\0\26\u0119\22\0\2\u0119\3\0\2\u011a\1\0\1\u011a"+
    "\1\0\26\u011a\22\0\2\u011a\3\0\2\u011b\1\0\1\u011b"+
    "\1\0\26\u011b\22\0\2\u011b\3\0\2\u011c\1\0\1\u011c"+
    "\1\0\26\u011c\22\0\2\u011c\3\0\2\u011d\1\0\1\u011d"+
    "\1\0\26\u011d\22\0\2\u011d\3\0\2\u011e\1\0\1\u011e"+
    "\1\0\26\u011e\22\0\2\u011e\3\0\2\u011f\1\0\1\u011f"+
    "\1\0\26\u011f\22\0\2\u011f\3\0\2\u0120\1\0\1\u0120"+
    "\1\0\26\u0120\22\0\2\u0120\3\0\2\u0121\1\0\1\u0121"+
    "\1\0\26\u0121\22\0\2\u0121\3\0\2\u0122\1\0\1\u0122"+
    "\1\0\26\u0122\22\0\2\u0122\3\0\2\u0123\1\0\1\u0123"+
    "\1\0\26\u0123\22\0\2\u0123\3\0\2\u0124\1\0\1\u0124"+
    "\1\0\26\u0124\22\0\2\u0124\3\0\2\u0125\1\0\1\u0125"+
    "\1\0\26\u0125\22\0\2\u0125\3\0\2\u0126\1\0\1\u0126"+
    "\1\0\26\u0126\22\0\2\u0126\3\0\2\u0127\1\0\1\u0127"+
    "\1\0\26\u0127\22\0\2\u0127\3\0\2\u0128\1\0\1\u0128"+
    "\1\0\26\u0128\22\0\2\u0128\3\0\2\u0129\1\0\1\u0129"+
    "\1\0\26\u0129\22\0\2\u0129\3\0\2\u012a\1\0\1\u012a"+
    "\1\0\26\u012a\22\0\2\u012a\3\0\2\u012b\1\0\1\u012b"+
    "\1\0\26\u012b\22\0\2\u012b\3\0\2\u012c\1\0\1\u012c"+
    "\1\0\26\u012c\22\0\2\u012c\3\0\2\u012d\1\0\1\u012d"+
    "\1\0\26\u012d\22\0\2\u012d\3\0\2\u012e\1\0\1\u012e"+
    "\1\0\26\u012e\22\0\2\u012e\3\0\2\u012f\1\0\1\u012f"+
    "\1\0\26\u012f\22\0\2\u012f\3\0\2\u0130\1\0\1\u0130"+
    "\1\0\26\u0130\22\0\2\u0130\3\0\2\u0131\1\0\1\u0131"+
    "\1\0\26\u0131\22\0\2\u0131\3\0\2\u0132\1\0\1\u0132"+
    "\1\0\26\u0132\22\0\2\u0132\3\0\2\u0133\1\0\1\u0133"+
    "\1\0\26\u0133\22\0\2\u0133\3\0\2\u0134\1\0\1\u0134"+
    "\1\0\26\u0134\22\0\2\u0134\3\0\2\u0135\1\0\1\u0135"+
    "\1\0\26\u0135\22\0\2\u0135\3\0\2\u0136\1\0\1\u0136"+
    "\1\0\26\u0136\22\0\2\u0136\3\0\2\u0137\1\0\1\u0137"+
    "\1\0\26\u0137\22\0\2\u0137\3\0\2\u0138\1\0\1\u0138"+
    "\1\0\26\u0138\22\0\2\u0138\3\0\2\u0139\1\0\1\u0139"+
    "\1\0\26\u0139\22\0\2\u0139\3\0\2\u013a\1\0\1\u013a"+
    "\1\0\26\u013a\22\0\2\u013a\3\0\2\u013b\1\0\1\u013b"+
    "\1\0\26\u013b\22\0\2\u013b\3\0\2\u013c\1\0\1\u013c"+
    "\1\0\26\u013c\22\0\2\u013c\3\0\2\u013d\1\0\1\u013d"+
    "\1\0\26\u013d\22\0\2\u013d\2\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[13900];
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
    "\3\1\2\11\44\1\1\0\1\11\2\0\5\11\1\1"+
    "\2\11\1\1\1\11\3\1\1\0\1\11\40\1\1\0"+
    "\2\11\1\0\2\1\1\0\1\11\24\1\1\0\1\11"+
    "\226\1\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[317];
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
    while (i < 178) {
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
        case 19: 
          { return OperadorPunto;
          }
        case 44: break;
        case 13: 
          { return OperadorMenorQue;
          }
        case 45: break;
        case 1: 
          { return Error;
          }
        case 46: break;
        case 23: 
          { return OperadorOr;
          }
        case 47: break;
        case 5: 
          { return OperadorResta;
          }
        case 48: break;
        case 33: 
          { return OperadorAsignacion;
          }
        case 49: break;
        case 35: 
          { lexeme=yytext(); return String;
          }
        case 50: break;
        case 24: 
          { return OperadorDivisionAsignacion;
          }
        case 51: break;
        case 8: 
          { return OperadorIgual;
          }
        case 52: break;
        case 14: 
          { return OperadorParentesisIzquierdo;
          }
        case 53: break;
        case 29: 
          { return OperadorDesplazamientoDerecha;
          }
        case 54: break;
        case 34: 
          { lexeme=yytext(); return Flotante;
          }
        case 55: break;
        case 17: 
          { return OperadorCorcheteDerecho;
          }
        case 56: break;
        case 22: 
          { lexeme=yytext(); return PalabraReservada;
          }
        case 57: break;
        case 31: 
          { return OperadorDiferente;
          }
        case 58: break;
        case 18: 
          { return OperadorDosPuntos;
          }
        case 59: break;
        case 41: 
          { return OperadorDesplazamientoIzquierdaAsignacion;
          }
        case 60: break;
        case 28: 
          { return OperadorMayorOIgualQue;
          }
        case 61: break;
        case 4: 
          { return Identificador;
          }
        case 62: break;
        case 26: 
          { return OperadorSumaAsignacion;
          }
        case 63: break;
        case 20: 
          { return OperadorDecremento;
          }
        case 64: break;
        case 42: 
          { return OperadorXor;
          }
        case 65: break;
        case 27: 
          { return OperadorIncremento;
          }
        case 66: break;
        case 39: 
          { return OperadorMod;
          }
        case 67: break;
        case 12: 
          { return OperadorMayorQue;
          }
        case 68: break;
        case 7: 
          { return OperadorMultiplicacion;
          }
        case 69: break;
        case 6: 
          { return OperadorDivision;
          }
        case 70: break;
        case 30: 
          { return OperadorMenorOIgualQue;
          }
        case 71: break;
        case 32: 
          { return OperadorDesplazamientoIzquierda;
          }
        case 72: break;
        case 15: 
          { return OperadorParentesisDerecho;
          }
        case 73: break;
        case 38: 
          { return OperadorDiv;
          }
        case 74: break;
        case 2: 
          { lexeme=yytext(); return Entero;
          }
        case 75: break;
        case 43: 
          { lexeme=yytext(); return Caracter;
          }
        case 76: break;
        case 10: 
          { return OperadorPuntoYComa;
          }
        case 77: break;
        case 9: 
          { return OperadorComa;
          }
        case 78: break;
        case 25: 
          { return OperadorMultiplicacionAsignacion;
          }
        case 79: break;
        case 37: 
          { return OperadorNot;
          }
        case 80: break;
        case 36: 
          { return OperadorAnd;
          }
        case 81: break;
        case 3: 
          { /*Ignore*/
          }
        case 82: break;
        case 16: 
          { return OperadorCorcheteIzquierdo;
          }
        case 83: break;
        case 21: 
          { return OperadorRestaAsignacion;
          }
        case 84: break;
        case 40: 
          { return OperadorDesplazamientoDerechaAsignacion;
          }
        case 85: break;
        case 11: 
          { return OperadorSuma;
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
