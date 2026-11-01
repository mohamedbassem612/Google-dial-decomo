package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class eni implements defpackage.gif {
    @Override // defpackage.gif
    public final void a(gii giiVar) {
        if (!(giiVar instanceof eoi)) {
            java.util.Objects.toString(giiVar);
            throw new java.lang.IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: ".concat(giiVar.toString()));
        }
        enn.b(giiVar, (eoi) giiVar);
        defpackage.avo.p(giiVar);
    }
}
