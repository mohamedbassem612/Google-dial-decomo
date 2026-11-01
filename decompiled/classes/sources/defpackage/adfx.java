package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class adfx implements defpackage.adgl {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.adgl
    public final com.google.android.libraries.micore.superpacks.SlicingResult a(com.google.android.libraries.micore.superpacks.SuperpackManifest superpackManifest, defpackage.adhv adhvVar) {
        android.os.Parcelable.Creator creator = com.google.android.libraries.micore.superpacks.SlicingResult.CREATOR;
        defpackage.adgk adgkVar = new defpackage.adgk();
        adgkVar.c(true);
        defpackage.ailk ailkVarListIterator = ((defpackage.aify) superpackManifest.f()).listIterator(0);
        while (ailkVarListIterator.hasNext()) {
            com.google.android.libraries.micore.superpacks.common.PackManifest packManifest = (com.google.android.libraries.micore.superpacks.common.PackManifest) ailkVarListIterator.next();
            defpackage.adiv adivVarG = com.google.android.libraries.micore.superpacks.common.Slice.g();
            adivVarG.f(packManifest);
            adgkVar.b(adivVarG.a());
        }
        return adgkVar.a();
    }

    public final java.lang.String toString() {
        return "GetAllSlicingStrategy";
    }

    @Override // defpackage.adgl
    public final /* synthetic */ void b() {
    }
}
