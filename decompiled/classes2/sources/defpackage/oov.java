package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class oov {
    public static final java.lang.String a = "notification_not_peek_for_game_mode";
    public static final java.lang.String b = "op_oimc_func_answer_without_ui";
    public static final java.lang.String c = "transsion_game_mode";
    public static final java.lang.String d = "background_call_on";
    public static final java.util.Map e = ajsz.aO(new aoiu[]{new aoiu("notification_not_peek_for_game_mode", new defpackage.mws(20)), new aoiu("op_oimc_func_answer_without_ui", new defpackage.oou(1)), new aoiu("transsion_game_mode", new defpackage.oou(0)), new aoiu(d, new defpackage.oou(2))});

    public static final int a(android.content.ContentResolver contentResolver, java.lang.String str) {
        return android.provider.Settings.Global.getInt(contentResolver, str, 0);
    }
}
