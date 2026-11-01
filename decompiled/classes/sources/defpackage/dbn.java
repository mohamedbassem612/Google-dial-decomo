package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dbn {
    public static final defpackage.dpf a = new defpackage.dpg(1.0f, 1.0f);

    public static final defpackage.dcv a(defpackage.dbk dbkVar) {
        defpackage.dcv dcvVar = dbkVar.k;
        if (dcvVar != null) {
            return dcvVar;
        }
        defpackage.cwh.b("LayoutNode should be attached to an owner");
        throw new defpackage.aoiq();
    }
}
