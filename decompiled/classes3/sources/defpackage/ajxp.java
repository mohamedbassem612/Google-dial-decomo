package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class ajxp implements aaui {
    public final /* synthetic */ android.content.Context a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ ajxp(android.content.Context context, boolean z) {
        this.a = context;
        this.b = z;
    }

    public final void d(java.lang.Object obj) {
        android.content.SharedPreferences.Editor editorEdit = ajsz.w(this.a).edit();
        editorEdit.putBoolean("proxy_retention", this.b);
        editorEdit.apply();
    }
}
