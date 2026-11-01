package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class ailu implements defpackage.aimn {
    public ailu(defpackage.ailv ailvVar) {
        j$.util.Objects.requireNonNull(ailvVar);
    }

    @Override // defpackage.aimn
    public final /* bridge */ /* synthetic */ void a(java.lang.Object obj, defpackage.aimm aimmVar) {
        java.util.Iterator it = ((java.util.List) obj).iterator();
        while (it.hasNext()) {
            aimmVar.a(it.next());
        }
    }
}
