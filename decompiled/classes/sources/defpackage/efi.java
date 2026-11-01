package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class efi implements defpackage.aolp {
    private final defpackage.efi a;
    private final defpackage.eei b;

    public efi(defpackage.efi efiVar, defpackage.eei eeiVar) {
        this.a = efiVar;
        this.b = eeiVar;
    }

    public final void a(defpackage.ecx ecxVar) {
        if (this.b == ecxVar) {
            throw new java.lang.IllegalStateException("Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.");
        }
        defpackage.efi efiVar = this.a;
        if (efiVar != null) {
            efiVar.a(ecxVar);
        }
    }

    @Override // defpackage.aolr
    public final java.lang.Object fold(java.lang.Object obj, defpackage.aonn aonnVar) {
        return aonnVar.a(obj, this);
    }

    @Override // defpackage.aolp, defpackage.aolr
    public final /* bridge */ defpackage.aolp get(defpackage.aolq aolqVar) {
        return defpackage.ajsz.aq(this, aolqVar);
    }

    @Override // defpackage.aolp
    public final defpackage.aolq getKey() {
        return defpackage.cch.c;
    }

    @Override // defpackage.aolr
    public final /* bridge */ defpackage.aolr minusKey(defpackage.aolq aolqVar) {
        return defpackage.ajsz.ar(this, aolqVar);
    }

    @Override // defpackage.aolr
    public final /* bridge */ defpackage.aolr plus(defpackage.aolr aolrVar) {
        return defpackage.ajsz.as(this, aolrVar);
    }
}
