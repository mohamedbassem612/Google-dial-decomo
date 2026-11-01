package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abdi extends defpackage.abcq {
    public abdi() {
        super(defpackage.zvl.SHARED_PREFERENCES_DELETION, 10L);
    }

    @Override // defpackage.abcq
    public final defpackage.abcv a(defpackage.abcv abcvVar, ahyn ahynVar) {
        long jCount;
        if (!ahynVar.f() || ((defpackage.zvz) ahynVar.b()).c != 6) {
            throw new java.lang.IllegalArgumentException();
        }
        android.content.Context contextM = abcvVar.b;
        defpackage.zvz zvzVar = (defpackage.zvz) ahynVar.b();
        defpackage.zvw zvwVar = zvzVar.c == 6 ? (defpackage.zvw) zvzVar.d : defpackage.zvw.a;
        if (zvwVar.b) {
            contextM = aa$.ExternalSyntheticApiModelOutline1.m(contextM);
        }
        android.content.SharedPreferences sharedPreferences = contextM.getSharedPreferences(zvwVar.c, 0);
        alat<java.lang.String> alatVar = zvwVar.d;
        alat alatVar2 = zvwVar.e;
        android.content.SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        boolean z = false;
        for (java.lang.String str : alatVar) {
            if (sharedPreferences.contains(str)) {
                editorEdit.remove(str);
                z = true;
            }
        }
        if (alatVar2.isEmpty()) {
            jCount = 0;
        } else {
            j$.util.stream.Stream streamFilter = j$.util.Collection.-EL.stream(sharedPreferences.getAll().keySet()).filter(new defpackage.abdh((aify) j$.util.Collection.-EL.stream(alatVar2).map(new defpackage.yoz(20)).collect(aido.a), 0));
            j$.util.Objects.requireNonNull(editorEdit);
            jCount = streamFilter.map(new defpackage.vxb(editorEdit, 17)).count();
        }
        if ((z || jCount > 0) && editorEdit.commit()) {
            android.util.Log.i("SPDeletionFix", "Preferences were deleted.");
        } else {
            android.util.Log.i("SPDeletionFix", "No preferences were deleted.");
        }
        return abcvVar;
    }

    @Override // defpackage.abcq
    public final java.lang.String b() {
        return "SHARED_PREFERENCES_DELETION";
    }
}
