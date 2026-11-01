package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class run implements java.util.concurrent.Callable {
    public final /* synthetic */ defpackage.rur a;

    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        java.lang.Object obj;
        boolean z;
        defpackage.rur rurVar = this.a;
        if (rurVar.g.isPresent()) {
            return null;
        }
        aca acaVar = new aca();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.content.Context context = rurVar.b;
        j$.util.Optional optionalFindFirst = j$.util.Collection.-EL.stream(((defpackage.ruj) alad.A(defpackage.ruj.a, context.getAssets().open("device_mmi_codes_file_mappings"), akzq.a())).b).filter(new mif(16)).findFirst();
        if (true != optionalFindFirst.isPresent()) {
            akzx akzxVarM = defpackage.rui.a.m();
            java.lang.String str = android.os.Build.MANUFACTURER;
            akzxVarM.u();
            defpackage.rui ruiVar = (defpackage.rui) akzxVarM.b;
            j$.util.Objects.requireNonNull(str);
            ruiVar.b |= 1;
            ruiVar.c = str;
            akzxVarM.u();
            defpackage.rui ruiVar2 = (defpackage.rui) akzxVarM.b;
            j$.util.Objects.requireNonNull("default_mmi_codes");
            ruiVar2.b |= 2;
            ruiVar2.d = "default_mmi_codes";
            obj = (defpackage.rui) akzxVarM.p();
        } else {
            obj = optionalFindFirst.get();
        }
        defpackage.rui ruiVar3 = (defpackage.rui) obj;
        aimz aimzVar = defpackage.rur.a;
        aimzVar.b().l("com/android/dialer/mmi/impl/MmiCodesProcessorImpl", "loadMmiData", 266, "MmiCodesProcessorImpl.java").v("Loaded MMI codes file mappings");
        if ((ruiVar3.b & 2) != 0) {
            defpackage.rum rumVar = (defpackage.rum) alad.A(defpackage.rum.a, context.getAssets().open(ruiVar3.d), akzq.a());
            for (defpackage.ruk rukVar : rumVar.b) {
                int i = rukVar.b;
                java.lang.String str2 = "";
                java.lang.String str3 = (i & 1) != 0 ? rukVar.c : "";
                java.lang.String str4 = (i & 2) != 0 ? rukVar.d : "";
                if ((i & 4) != 0) {
                    str2 = rukVar.e;
                }
                acaVar.put(str3 + str4 + str2, rukVar);
            }
            for (defpackage.rul rulVar : rumVar.c) {
                arrayList.add(new defpackage.rup(java.util.regex.Pattern.compile(rulVar.b), rulVar.c));
            }
            z = rumVar.d;
        } else {
            a.bI(aimzVar.c().m(aioa.b), "Device MMI code file mapping has no resource file name.", "com/android/dialer/mmi/impl/MmiCodesProcessorImpl", "loadMmiData", (char) 297, "MmiCodesProcessorImpl.java", zct.b);
            z = false;
        }
        rurVar.g = j$.util.Optional.of(new defpackage.ruq(aigf.i(acaVar), aify.n(arrayList), z));
        aimzVar.b().l("com/android/dialer/mmi/impl/MmiCodesProcessorImpl", "loadMmiData", 306, "MmiCodesProcessorImpl.java").v("MMI codes loading has completed");
        rurVar.e.o(rmx.ih);
        return null;
    }
}
