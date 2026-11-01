package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class lov extends defpackage.lou {
    protected final void a() {
        aify aifyVar = this.a;
        this.a = null;
        if (aifyVar != null) {
            boolean zR = (!isCancelled()) | r();
            int size = aifyVar.size();
            for (int i = 0; i < size; i++) {
                ((ajcq) aifyVar.get(i)).cancel(zR);
            }
        }
    }
}
