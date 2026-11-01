package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class jml implements defpackage.rnt {
    private final defpackage.az a;
    private defpackage.jme b;
    private defpackage.jmj c;

    public jml(defpackage.az azVar) {
        if (azVar == null) {
            defpackage.aooh.i("fragmentActivity");
        }
        this.a = azVar;
    }

    @Override // defpackage.emj
    public final void a(defpackage.emx emxVar) {
        defpackage.az azVar = this.a;
        this.b = new defpackage.jme(azVar.a());
        this.c = new defpackage.jmj(azVar.findViewById(android.R.id.content), azVar.a());
    }

    @Override // defpackage.emj
    public final void c(defpackage.emx emxVar) {
        defpackage.az azVar = this.a;
        defpackage.epq epqVarA = defpackage.epq.a(azVar);
        defpackage.jme jmeVar = this.b;
        defpackage.jmj jmjVar = null;
        if (jmeVar == null) {
            defpackage.aooh.j("showBlockReportSpamDialogReceiver");
            jmeVar = null;
        }
        epqVarA.c(jmeVar);
        defpackage.epq epqVarA2 = defpackage.epq.a(azVar);
        defpackage.jmj jmjVar2 = this.c;
        if (jmjVar2 == null) {
            defpackage.aooh.j("showSpamPromoDialogReceiver");
        } else {
            jmjVar = jmjVar2;
        }
        epqVarA2.c(jmjVar);
    }

    @Override // defpackage.emj
    public final void fn(defpackage.emx emxVar) {
        defpackage.az azVar = this.a;
        defpackage.epq epqVarA = defpackage.epq.a(azVar);
        defpackage.jme jmeVar = this.b;
        defpackage.jmj jmjVar = null;
        if (jmeVar == null) {
            defpackage.aooh.j("showBlockReportSpamDialogReceiver");
            jmeVar = null;
        }
        epqVarA.b(jmeVar, defpackage.jme.a());
        defpackage.epq epqVarA2 = defpackage.epq.a(azVar);
        defpackage.jmj jmjVar2 = this.c;
        if (jmjVar2 == null) {
            defpackage.aooh.j("showSpamPromoDialogReceiver");
        } else {
            jmjVar = jmjVar2;
        }
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("show_spam_promo_dialog");
        epqVarA2.b(jmjVar, intentFilter);
    }

    @Override // defpackage.emj
    public final /* synthetic */ void b(defpackage.emx emxVar) {
    }

    @Override // defpackage.emj
    public final /* synthetic */ void e(defpackage.emx emxVar) {
    }

    @Override // defpackage.emj
    public final /* synthetic */ void f(defpackage.emx emxVar) {
    }
}
