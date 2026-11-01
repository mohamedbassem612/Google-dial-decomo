package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vuk implements agxi {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ defpackage.vul b;

    public vuk(defpackage.vul vulVar, boolean z) {
        this.a = z;
        j$.util.Objects.requireNonNull(vulVar);
        this.b = vulVar;
    }

    public final ajbg a() {
        defpackage.vvm.a.b().l("com/android/dialer/voicemail/tab/impl/dataservice/impl/cache/VisualVoicemailFragmentModelCache", "fetch", 68, "VisualVoicemailFragmentModelCache.java").v("enter");
        defpackage.vvm vvmVar = this.b.b;
        return new ajbg(ahrv.g(vvmVar.e.c()).h(new vuj(vvmVar, 7), vvmVar.b));
    }

    public final ajcq b() {
        ahoq ahoqVarW = ahvr.W(1010, "VisualVoicemailDataServiceImpl_getVisualVoicemailFragmentModel_fetchAndStoreData");
        try {
            defpackage.vul vulVar = this.b;
            ahrv ahrvVarG = ahrv.g(vulVar.m.a());
            defpackage.vmq vmqVar = new defpackage.vmq(this, 14);
            ajct ajctVar = vulVar.d;
            ahrv ahrvVarI = ahrvVarG.i(vmqVar, ajctVar).i(new defpackage.vmq(this, 15), ajctVar);
            defpackage.vvm vvmVar = vulVar.b;
            j$.util.Objects.requireNonNull(vvmVar);
            ahrv ahrvVarI2 = ahrvVarI.i(new defpackage.vmq(vvmVar, 16), ajctVar);
            ahoqVarW.a(ahrvVarI2);
            ahoqVarW.close();
            return ahrvVarI2;
        } catch (java.lang.Throwable th) {
            try {
                ahoqVarW.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final /* synthetic */ java.lang.Object e() {
        return defpackage.vul.a();
    }
}
