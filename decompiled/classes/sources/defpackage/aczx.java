package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aczx implements defpackage.acyv {
    public final java.util.concurrent.Executor a;
    private final android.content.Context b;
    private final defpackage.acxa c;
    private final defpackage.ahyn d;

    public aczx(android.content.Context context, defpackage.acxa acxaVar, defpackage.ahyn ahynVar, java.util.concurrent.Executor executor) {
        this.b = context;
        this.c = acxaVar;
        this.d = ahynVar;
        this.a = executor;
    }

    @Override // defpackage.acyv
    public final defpackage.ajcq a(acvu acvuVar) {
        int i = defpackage.adbe.a;
        acvu acvuVarAo = defpackage.afsq.ao(acvuVar, (defpackage.abrz.V() / 1000) + acvuVar.k);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(acvuVarAo);
        return m(arrayList);
    }

    @Override // defpackage.acyv
    public final defpackage.ajcq b() {
        android.content.Context context = this.b;
        defpackage.ahyn ahynVar = this.d;
        defpackage.abrz.D(context, "gms_icing_mdd_groups", ahynVar).edit().clear().commit();
        defpackage.abrz.D(context, "gms_icing_mdd_group_key_properties", ahynVar).edit().clear().commit();
        return k();
    }

    @Override // defpackage.acyv
    public final defpackage.ajcq c() {
        return defpackage.ahvr.I(d(), new aczi(this, 8), this.a);
    }

    @Override // defpackage.acyv
    public final defpackage.ajcq d() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.content.SharedPreferences sharedPreferencesD = defpackage.abrz.D(this.b, "gms_icing_mdd_groups", this.d);
        android.content.SharedPreferences.Editor editorEdit = null;
        for (java.lang.String str : sharedPreferencesD.getAll().keySet()) {
            try {
                arrayList.add(defpackage.afsq.ai(str));
            } catch (defpackage.adbx e) {
                defpackage.adbe.f(e, "Failed to deserialize groupKey:".concat(java.lang.String.valueOf(str)));
                this.c.a();
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

    @Override // defpackage.acyv
    public final defpackage.ajcq e() {
        java.lang.Object objAg;
        java.io.File fileAj = defpackage.afsq.aj(this.b, this.d);
        try {
            java.nio.ByteBuffer byteBufferWrap = java.nio.ByteBuffer.wrap(new defpackage.aisp(fileAj).h());
            acvu acvuVar = acvu.a;
            objAg = defpackage.afsq.ag(byteBufferWrap, acvu.class, defpackage.alad.M(acvu.class));
            if (objAg == null) {
                objAg = defpackage.aike.a;
            }
        } catch (java.io.FileNotFoundException unused) {
            fileAj.getAbsolutePath();
            int i = defpackage.adbe.a;
            objAg = defpackage.aike.a;
        } catch (java.io.IOException e) {
            defpackage.adbe.g(e, "%s: IOException occurred while reading file groups.", "FileGroupsMetadataUtil");
            objAg = defpackage.aike.a;
        }
        return defpackage.aiql.z(objAg);
    }

    @Override // defpackage.acyv
    public final defpackage.ajcq f() {
        return defpackage.ajcm.a;
    }

    @Override // defpackage.acyv
    public final defpackage.ajcq g(acwb acwbVar) {
        android.content.Context context = this.b;
        java.lang.String strAk = defpackage.afsq.ak(acwbVar);
        android.content.SharedPreferences sharedPreferencesD = defpackage.abrz.D(context, "gms_icing_mdd_groups", this.d);
        acvu acvuVar = acvu.a;
        return defpackage.aiql.z(defpackage.abrz.F(sharedPreferencesD, strAk, defpackage.alad.M(acvu.class)));
    }

    @Override // defpackage.acyv
    public final defpackage.ajcq h(acwb acwbVar) {
        android.content.Context context = this.b;
        java.lang.String strAk = defpackage.afsq.ak(acwbVar);
        android.content.SharedPreferences sharedPreferencesD = defpackage.abrz.D(context, "gms_icing_mdd_group_key_properties", this.d);
        acwc acwcVar = acwc.a;
        return defpackage.aiql.z(defpackage.abrz.F(sharedPreferencesD, strAk, defpackage.alad.M(acwc.class)));
    }

    @Override // defpackage.acyv
    public final defpackage.ajcq i(acwb acwbVar) {
        android.content.Context context = this.b;
        defpackage.ahyn ahynVar = this.d;
        return defpackage.aiql.z(java.lang.Boolean.valueOf(defpackage.abrz.J(defpackage.abrz.D(context, "gms_icing_mdd_groups", ahynVar), defpackage.afsq.ak(acwbVar))));
    }

    @Override // defpackage.acyv
    public final defpackage.ajcq j(java.util.List list) {
        android.content.SharedPreferences.Editor editorEdit = defpackage.abrz.D(this.b, "gms_icing_mdd_groups", this.d).edit();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            acwb acwbVar = (acwb) it.next();
            java.lang.String str = acwbVar.c;
            java.lang.String str2 = acwbVar.d;
            int i = defpackage.adbe.a;
            editorEdit.remove(defpackage.abrz.H(acwbVar));
        }
        return defpackage.aiql.z(java.lang.Boolean.valueOf(editorEdit.commit()));
    }

    @Override // defpackage.acyv
    public final defpackage.ajcq k() {
        n().delete();
        return defpackage.ajcm.a;
    }

    @Override // defpackage.acyv
    public final defpackage.ajcq l(acwb acwbVar, acvu acvuVar) {
        android.content.Context context = this.b;
        defpackage.ahyn ahynVar = this.d;
        return defpackage.aiql.z(java.lang.Boolean.valueOf(defpackage.abrz.K(defpackage.abrz.D(context, "gms_icing_mdd_groups", ahynVar), defpackage.afsq.ak(acwbVar), acvuVar)));
    }

    @Override // defpackage.acyv
    public final defpackage.ajcq m(java.util.List list) {
        defpackage.ajcq ajcqVarZ;
        java.io.File fileN = n();
        try {
            java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(fileN, true);
            try {
                java.nio.ByteBuffer byteBufferAf = defpackage.afsq.af(list);
                if (byteBufferAf == null) {
                    ajcqVarZ = defpackage.aiql.z(java.lang.Boolean.FALSE);
                } else {
                    defpackage.ahvr.bZ(byteBufferAf.hasArray(), "ByteBuffer is not heap-backed, cannot write using stream.");
                    fileOutputStream.write(byteBufferAf.array(), byteBufferAf.arrayOffset() + byteBufferAf.position(), byteBufferAf.remaining());
                    ajcqVarZ = defpackage.aiql.z(java.lang.Boolean.TRUE);
                }
                fileOutputStream.close();
                return ajcqVarZ;
            } catch (java.lang.Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (java.io.FileNotFoundException unused) {
            defpackage.adbe.c("File %s not found while writing.", fileN.getAbsolutePath());
            return defpackage.aiql.z(java.lang.Boolean.FALSE);
        } catch (java.io.IOException unused2) {
            defpackage.adbe.b("IOException occurred while writing file groups.");
            return defpackage.aiql.z(java.lang.Boolean.FALSE);
        }
    }

    final java.io.File n() {
        return defpackage.afsq.aj(this.b, this.d);
    }
}
