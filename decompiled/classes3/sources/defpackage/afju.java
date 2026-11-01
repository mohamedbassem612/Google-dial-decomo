package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afju extends android.text.style.ClickableSpan {
    final /* synthetic */ java.lang.String a;
    final /* synthetic */ android.app.Activity b;
    final /* synthetic */ java.lang.String c;

    public afju(java.lang.String str, android.app.Activity activity, java.lang.String str2) {
        this.a = str;
        this.b = activity;
        this.c = str2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(android.view.View view) {
        apdh apdhVar = new apdh();
        java.lang.String str = this.a;
        if (str != null) {
            aehj.I(this.b, str);
        } else {
            try {
                android.app.Activity activity = this.b;
                int i = true != afjz.j(activity) ? 0 : 268435456;
                java.lang.String str2 = this.c;
                j$.util.Objects.requireNonNull(activity);
                if (str2 == null || str2.isEmpty()) {
                    defpackage.afcd.h(activity, i);
                } else {
                    android.content.Intent intentPutExtra = new android.content.Intent("com.google.android.gms.accountsettings.action.VIEW_SETTINGS").setPackage("com.google.android.gms").addFlags(i).putExtra("extra.accountName", str2).putExtra("extra.screenId", 500);
                    if (intentPutExtra.resolveActivity(activity.getPackageManager()) == null) {
                        defpackage.afcd.h(activity, i);
                    } else {
                        activity.startActivityForResult(intentPutExtra, 0);
                    }
                }
            } catch (defpackage.afae e) {
                android.util.Log.e("ResourceUtils", "No app found to open URL: ".concat(java.lang.String.valueOf(e.a)));
            }
        }
        android.app.Activity activity2 = this.b;
        java.lang.String str3 = this.c;
        aehj aehjVar = afjy.c;
        if (afjy.c(anjv.c(afjy.b))) {
            amac amacVarT = amac.t();
            akzx akzxVarM = defpackage.alhy.a.m();
            akzxVarM.u();
            ((defpackage.alhy) akzxVarM.b).b = a.U(2);
            akzxVarM.u();
            ((defpackage.alhy) akzxVarM.b).c = 2;
            amacVarT.r((defpackage.alhy) akzxVarM.p(), apdhVar.b(), apdhVar.a(), activity2, str3);
        }
    }
}
