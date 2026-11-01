package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aczz implements defpackage.aczw {
    private final android.content.Context a;
    private final defpackage.acxa b;
    private final defpackage.ahyn c;
    private final defpackage.acvl d;

    public aczz(android.content.Context context, defpackage.acxa acxaVar, defpackage.ahyn ahynVar, defpackage.acvl acvlVar) {
        this.a = context;
        this.b = acxaVar;
        this.c = ahynVar;
        this.d = acvlVar;
    }

    @Override // defpackage.aczw
    public final defpackage.ajcq a() {
        defpackage.abrz.D(this.a, "gms_icing_mdd_shared_files", this.c).edit().clear().commit();
        return defpackage.aiql.z(null);
    }

    @Override // defpackage.aczw
    public final defpackage.ajcq c() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.content.Context context = this.a;
        android.content.SharedPreferences sharedPreferencesD = defpackage.abrz.D(context, "gms_icing_mdd_shared_files", this.c);
        android.content.SharedPreferences.Editor editorEdit = null;
        for (java.lang.String str : sharedPreferencesD.getAll().keySet()) {
            try {
                arrayList.add(defpackage.afsq.ab(str, context, this.b));
            } catch (defpackage.adbz e) {
                defpackage.adbe.f(e, "Failed to deserialize newFileKey:".concat(java.lang.String.valueOf(str)));
                defpackage.acxa acxaVar = this.b;
                defpackage.ahzf.d("|").j(str).size();
                acxaVar.a();
                if (editorEdit == null) {
                    editorEdit = sharedPreferencesD.edit();
                }
                editorEdit.remove(str);
            }
        }
        if (editorEdit != null) {
            editorEdit.commit();
        }
        return defpackage.aiql.z(arrayList);
    }

    @Override // defpackage.aczw
    public final defpackage.ajcq d() {
        int i;
        int i2;
        android.content.Context context = this.a;
        if (!defpackage.afsq.aD(context)) {
            int i3 = defpackage.adbe.a;
            android.content.Context context2 = this.a;
            defpackage.afsq.aF(context2);
            defpackage.afsq.aE(context2, aczc.a(this.d.g()));
            return defpackage.aiql.z(java.lang.Boolean.FALSE);
        }
        aczc aczcVarA = aczc.a(this.d.g());
        defpackage.acxa acxaVar = this.b;
        int i4 = aczcVarA.d;
        aczc aczcVarAC = defpackage.afsq.aC(context, acxaVar);
        int i5 = aczcVarAC.d;
        boolean z = true;
        if (i4 != i5) {
            int i6 = 2;
            if (i4 < i5) {
                defpackage.adbe.e("%s Cannot migrate back from value %s to %s. Clear everything!", "SharedFilesMetadata", aczcVarAC, aczcVarA);
                new java.lang.Exception("Downgraded file key from " + aczcVarAC.toString() + " to " + aczcVarA.toString() + '.');
                acxaVar.a();
                defpackage.afsq.aE(context, aczcVarA);
                z = false;
            } else {
                int i7 = i5 + 1;
                while (true) {
                    if (i7 <= i4) {
                        try {
                            aczc aczcVarA2 = aczc.a(i7);
                            int iOrdinal = aczcVarA2.ordinal();
                            if (iOrdinal == z) {
                                i = i4;
                                int i8 = defpackage.adbe.a;
                                android.content.SharedPreferences sharedPreferencesD = defpackage.abrz.D(context, "gms_icing_mdd_shared_files", this.c);
                                android.content.SharedPreferences.Editor editorEdit = sharedPreferencesD.edit();
                                for (java.lang.String str : sharedPreferencesD.getAll().keySet()) {
                                    try {
                                        acwe acweVarAb = defpackage.afsq.ab(str, context, acxaVar);
                                        acwg acwgVar = acwg.a;
                                        acwg acwgVarF = defpackage.abrz.F(sharedPreferencesD, str, defpackage.alad.M(acwg.class));
                                        if (acwgVarF == null) {
                                            defpackage.adbe.c("%s: Unable to read sharedFile from shared preferences.", "SharedFilesMetadata");
                                            editorEdit.remove(str);
                                        } else {
                                            editorEdit.remove(str);
                                            defpackage.abrz.I(editorEdit, defpackage.afsq.ae(acweVarAb), acwgVarF);
                                        }
                                    } catch (defpackage.adbz unused) {
                                        defpackage.adbe.d("%s Failed to deserialize file key %s, remove and continue.", "SharedFilesMetadata", str);
                                        this.b.a();
                                        editorEdit.remove(str);
                                    }
                                }
                                if (!editorEdit.commit()) {
                                    defpackage.adbe.b("Failed to commit migration metadata to disk");
                                    defpackage.acxa acxaVar2 = this.b;
                                    new java.lang.Exception("Migrate to DownloadTransform failed.");
                                    acxaVar2.a();
                                    break;
                                }
                                defpackage.afsq.aE(this.a, aczc.a(i7));
                                i7++;
                                i4 = i;
                                z = true;
                                i6 = 2;
                            } else {
                                if (iOrdinal != i6) {
                                    throw new java.lang.UnsupportedOperationException("Upgrade to version " + aczcVarA2.name() + "not supported!");
                                }
                                int i9 = defpackage.adbe.a;
                                android.content.Context context3 = this.a;
                                android.content.SharedPreferences sharedPreferencesD2 = defpackage.abrz.D(context3, "gms_icing_mdd_shared_files", this.c);
                                android.content.SharedPreferences.Editor editorEdit2 = sharedPreferencesD2.edit();
                                for (java.lang.String str2 : sharedPreferencesD2.getAll().keySet()) {
                                    try {
                                        acwe acweVarAb2 = defpackage.afsq.ab(str2, context3, this.b);
                                        acwg acwgVar2 = acwg.a;
                                        i2 = i4;
                                        acwg acwgVarF2 = defpackage.abrz.F(sharedPreferencesD2, str2, defpackage.alad.M(acwg.class));
                                        if (acwgVarF2 == null) {
                                            defpackage.adbe.c("%s: Unable to read sharedFile from shared preferences.", "SharedFilesMetadata");
                                            editorEdit2.remove(str2);
                                        } else {
                                            editorEdit2.remove(str2);
                                            defpackage.abrz.I(editorEdit2, defpackage.afsq.ad(acweVarAb2), acwgVarF2);
                                        }
                                    } catch (defpackage.adbz unused2) {
                                        i2 = i4;
                                        defpackage.adbe.d("%s Failed to deserialize file key %s, remove and continue.", "SharedFilesMetadata", str2);
                                        this.b.a();
                                        editorEdit2.remove(str2);
                                    }
                                    i4 = i2;
                                }
                                i = i4;
                                if (!editorEdit2.commit()) {
                                    defpackage.adbe.b("Failed to commit migration metadata to disk");
                                    defpackage.acxa acxaVar3 = this.b;
                                    new java.lang.Exception("Migrate to ChecksumOnly failed.");
                                    acxaVar3.a();
                                    break;
                                }
                                defpackage.afsq.aE(this.a, aczc.a(i7));
                                i7++;
                                i4 = i;
                                z = true;
                                i6 = 2;
                            }
                        } catch (java.lang.Throwable th) {
                            android.content.Context context4 = this.a;
                            defpackage.acxa acxaVar4 = this.b;
                            if (defpackage.afsq.aC(context4, acxaVar4).d != aczcVarA.d && !defpackage.afsq.aE(context4, aczcVarA)) {
                                defpackage.adbe.b(defpackage.a.bG((byte) 46, aczcVarA, "Failed to commit migration version to disk. Fail to set target version to "));
                                new java.lang.Exception(defpackage.a.bG((byte) 46, aczcVarA, "Fail to set target version "));
                                acxaVar4.a();
                            }
                            throw th;
                        }
                    } else {
                        android.content.Context context5 = this.a;
                        defpackage.acxa acxaVar5 = this.b;
                        if (defpackage.afsq.aC(context5, acxaVar5).d != aczcVarA.d && !defpackage.afsq.aE(context5, aczcVarA)) {
                            defpackage.adbe.b(defpackage.a.bG((byte) 46, aczcVarA, "Failed to commit migration version to disk. Fail to set target version to "));
                            new java.lang.Exception(defpackage.a.bG((byte) 46, aczcVarA, "Fail to set target version "));
                            acxaVar5.a();
                        }
                        z = true;
                    }
                }
                android.content.Context context6 = this.a;
                defpackage.acxa acxaVar6 = this.b;
                if (defpackage.afsq.aC(context6, acxaVar6).d != aczcVarA.d && !defpackage.afsq.aE(context6, aczcVarA)) {
                    defpackage.adbe.b(defpackage.a.bG((byte) 46, aczcVarA, "Failed to commit migration version to disk. Fail to set target version to "));
                    new java.lang.Exception(defpackage.a.bG((byte) 46, aczcVarA, "Fail to set target version "));
                    acxaVar6.a();
                }
                z = false;
            }
        }
        return defpackage.aiql.z(java.lang.Boolean.valueOf(z));
    }

    @Override // defpackage.aczw
    public final defpackage.ajcq e(acwe acweVar) {
        return defpackage.ahvr.H(f(new defpackage.aile(acweVar)), new aczo(acweVar, 3), defpackage.ajbm.INSTANCE);
    }

    @Override // defpackage.aczw
    public final defpackage.ajcq f(defpackage.aihd aihdVar) {
        android.content.Context context = this.a;
        android.content.SharedPreferences sharedPreferencesD = defpackage.abrz.D(context, "gms_icing_mdd_shared_files", this.c);
        defpackage.aigb aigbVar = new defpackage.aigb(4);
        defpackage.ailj it = aihdVar.iterator();
        while (it.hasNext()) {
            acwe acweVar = (acwe) it.next();
            java.lang.String strAc = defpackage.afsq.ac(acweVar, context, this.b);
            acwg acwgVar = acwg.a;
            acwg acwgVarF = defpackage.abrz.F(sharedPreferencesD, strAc, defpackage.alad.M(acwg.class));
            if (acwgVarF != null) {
                aigbVar.i(acweVar, acwgVarF);
            }
        }
        return defpackage.aiql.z(aigbVar.e(false));
    }

    @Override // defpackage.aczw
    public final defpackage.ajcq g(acwe acweVar) {
        android.content.Context context = this.a;
        defpackage.ahyn ahynVar = this.c;
        return defpackage.aiql.z(java.lang.Boolean.valueOf(defpackage.abrz.J(defpackage.abrz.D(context, "gms_icing_mdd_shared_files", ahynVar), defpackage.afsq.ac(acweVar, context, this.b))));
    }

    @Override // defpackage.aczw
    public final defpackage.ajcq h(acwe acweVar, acwg acwgVar) {
        android.content.Context context = this.a;
        defpackage.ahyn ahynVar = this.c;
        return defpackage.aiql.z(java.lang.Boolean.valueOf(defpackage.abrz.K(defpackage.abrz.D(context, "gms_icing_mdd_shared_files", ahynVar), defpackage.afsq.ac(acweVar, context, this.b), acwgVar)));
    }
}
