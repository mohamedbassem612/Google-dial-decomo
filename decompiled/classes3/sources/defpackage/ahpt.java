package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class ahpt implements android.content.DialogInterface.OnClickListener {
    public final /* synthetic */ ahpz a;
    public final /* synthetic */ int b;
    public final /* synthetic */ java.lang.String c;
    public final /* synthetic */ android.content.DialogInterface.OnClickListener d;

    public /* synthetic */ ahpt(ahpz ahpzVar, int i, java.lang.String str, android.content.DialogInterface.OnClickListener onClickListener) {
        this.a = ahpzVar;
        this.b = i;
        this.c = str;
        this.d = onClickListener;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i) {
        ahpz ahpzVar = this.a;
        int i2 = this.b;
        android.content.DialogInterface.OnClickListener onClickListener = this.d;
        ahok ahokVarF = ahpzVar.f(i2, this.c);
        try {
            onClickListener.onClick(dialogInterface, i);
            ajsz.ak(ahokVarF, (java.lang.Throwable) null);
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                ajsz.ak(ahokVarF, th);
                throw th2;
            }
        }
    }
}
