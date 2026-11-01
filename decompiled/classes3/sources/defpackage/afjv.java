package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afjv extends android.text.style.ClickableSpan {
    final /* synthetic */ android.content.Context a;
    final /* synthetic */ java.lang.String b;
    final /* synthetic */ java.lang.String c;

    public afjv(android.content.Context context, java.lang.String str, java.lang.String str2) {
        this.a = context;
        this.b = str;
        this.c = str2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(android.view.View view) {
        apdh apdhVar = new apdh();
        java.lang.String str = this.b;
        if (str == null) {
            str = "https://www.google.com/policies/terms/";
        }
        android.content.Context context = this.a;
        aehj.I(context, str);
        aehj aehjVar = afjy.c;
        if (afjy.c(anjv.c(afjy.b))) {
            java.lang.String str2 = this.c;
            amac amacVarT = amac.t();
            akzx akzxVarM = defpackage.alhy.a.m();
            akzxVarM.u();
            ((defpackage.alhy) akzxVarM.b).b = a.U(2);
            akzxVarM.u();
            ((defpackage.alhy) akzxVarM.b).c = 3;
            amacVarT.r((defpackage.alhy) akzxVarM.p(), apdhVar.b(), apdhVar.a(), context, str2);
        }
    }
}
