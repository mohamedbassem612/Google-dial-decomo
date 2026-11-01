package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class ahml implements ahyc {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ ahml(akwz akwzVar, alfr alfrVar, akxt akxtVar, int i) {
        this.$cid = i;
        this.b = akwzVar;
        this.a = alfrVar;
        this.c = akxtVar;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [ahzi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4, types: [j$.time.temporal.Temporal, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v4, types: [ahzi, java.lang.Object] */
    public final java.lang.Object apply(java.lang.Object obj) {
        int i = this.$cid;
        boolean z = false;
        if (i == 0) {
            if (!((java.lang.Boolean) obj).booleanValue()) {
                return null;
            }
            java.lang.Object obj2 = this.c;
            java.lang.Object obj3 = this.b;
            defpackage.akxm akxmVar = (defpackage.akxm) this.a;
            ?? r5 = akxmVar.d;
            defpackage.ahiy ahiyVar = (defpackage.ahiy) r5.a();
            aogc aogcVar = (aogc) akxmVar.e;
            java.lang.Object obj4 = aogcVar.b;
            ahla ahlaVar = (ahla) obj3;
            ahiyVar.b((java.lang.String) obj4, aogcVar.p(), ahlaVar.b(), "attempt");
            apjb apjbVar = (apjb) obj2;
            ahyn ahynVar = (ahyn) apjbVar.a;
            if (!ahynVar.f()) {
                return null;
            }
            ((afim) ((defpackage.ahiy) r5.a()).e.eZ()).b(aizo.a(j$.time.Duration.between((j$.time.temporal.Temporal) ahynVar.b(), j$.time.Instant.now())), new java.lang.Object[]{obj4, aogcVar.p(), ahlaVar.b()});
            ((afim) ((defpackage.ahiy) r5.a()).f.eZ()).b(aizo.a((j$.time.Duration) apjbVar.b), new java.lang.Object[]{obj4, aogcVar.p(), ahlaVar.b()});
            return null;
        }
        if (i == 1) {
            defpackage.ahio ahioVar = (defpackage.ahio) this.a;
            defpackage.ahif ahifVar = (defpackage.ahif) obj;
            com.google.android.gms.googlehelp.GoogleHelp googleHelp = new com.google.android.gms.googlehelp.GoogleHelp(ahioVar.a);
            googleHelp.q = ahioVar.b;
            int i2 = 0;
            while (true) {
                aike aikeVar = ahioVar.c;
                if (i2 >= aikeVar.d) {
                    break;
                }
                defpackage.ahin ahinVar = (defpackage.ahin) aikeVar.get(i2);
                googleHelp.r.add(new com.google.android.gms.googlehelp.internal.common.OverflowMenuItem(ahinVar.a, ahinVar.b, ahinVar.c));
                i2++;
            }
            com.google.android.gms.feedback.ThemeSettings themeSettings = new com.google.android.gms.feedback.ThemeSettings(3, 0);
            themeSettings.a = 3;
            googleHelp.s = themeSettings;
            ahyn ahynVar2 = ahifVar.a;
            if (ahynVar2.f()) {
                googleHelp.c = new android.accounts.Account((java.lang.String) ahynVar2.b(), "com.google");
            }
            java.lang.Object obj5 = this.b;
            defpackage.abtr abtrVar = (defpackage.abtr) this.c;
            java.lang.Object obj6 = abtrVar.b;
            android.content.Context context = (android.content.Context) abtrVar.e;
            com.google.android.gms.feedback.FeedbackOptions feedbackOptionsA = ((apjb) obj6).A(context, (defpackage.ahih) obj5, ahifVar);
            java.io.File file = new java.io.File(context.getCacheDir(), "feedback");
            googleHelp.R = feedbackOptionsA.u;
            googleHelp.v = new com.google.android.gms.feedback.ErrorReport(feedbackOptionsA, file);
            googleHelp.v.X = "GoogleHelp";
            return googleHelp.a();
        }
        if (i == 2) {
            return defpackage.agwm.w((anmv) this.c, (anmc) obj, (anpk) this.a, (anmb) this.b);
        }
        java.util.List list = (java.util.List) obj;
        ((akwz) this.b).d(list, (alfr) this.a, (akxt) this.c, defpackage.akxf.a);
        akzx akzxVarM = akxu.a.m();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            akxz akxzVar = ((akxx) it.next()).d;
            if (akxzVar == null) {
                akxzVar = akxz.a;
            }
            int iAQ = a.aQ(akxzVar.c);
            if (iAQ == 0) {
                iAQ = 1;
            }
            if (iAQ != 2) {
                akzxVarM.u();
                akxu akxuVar = akzxVarM.b;
                akxuVar.b |= 1;
                akxuVar.c = z;
                return akzxVarM.p();
            }
        }
        z = true;
        akzxVarM.u();
        akxu akxuVar2 = akzxVarM.b;
        akxuVar2.b |= 1;
        akxuVar2.c = z;
        return akzxVarM.p();
    }

    public /* synthetic */ ahml(defpackage.akxm akxmVar, ahla ahlaVar, apjb apjbVar, int i) {
        this.$cid = i;
        this.a = akxmVar;
        this.b = ahlaVar;
        this.c = apjbVar;
    }

    public /* synthetic */ ahml(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i) {
        this.$cid = i;
        this.c = obj;
        this.a = obj2;
        this.b = obj3;
    }
}
