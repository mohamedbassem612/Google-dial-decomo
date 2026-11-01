package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class aigs extends aifo {
    private static final long serialVersionUID = 0;
    private final transient defpackage.aigt a;

    public aigs(defpackage.aigt aigtVar) {
        this.a = aigtVar;
    }

    public final int c(java.lang.Object[] objArr, int i) {
        ailj ailjVarK = this.a.map.c().k();
        while (ailjVarK.hasNext()) {
            i = ((aifo) ailjVarK.next()).c(objArr, i);
        }
        return i;
    }

    public final boolean contains(java.lang.Object obj) {
        return this.a.v(obj);
    }

    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final ailj iterator() {
        return new defpackage.aigp(this.a);
    }

    public final boolean l() {
        throw null;
    }

    public final int size() {
        return this.a.size;
    }

    public java.lang.Object writeReplace() {
        return super.writeReplace();
    }
}
