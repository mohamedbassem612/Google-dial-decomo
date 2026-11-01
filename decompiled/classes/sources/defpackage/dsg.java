package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class dsg extends defpackage.dsc {
    final /* synthetic */ defpackage.dsh d;

    public dsg(defpackage.dsh dshVar) {
        this.d = dshVar;
    }

    @Override // defpackage.dsc
    protected final java.lang.String b() {
        defpackage.dsd dsdVar = (defpackage.dsd) this.d.a.get();
        if (dsdVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + java.lang.String.valueOf(dsdVar.a) + ']';
    }
}
