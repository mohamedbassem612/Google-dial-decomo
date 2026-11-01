package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aifu extends defpackage.ailk {
    private final defpackage.aify a;

    public aifu(defpackage.aify aifyVar, int i) {
        super(aifyVar.size(), i);
        this.a = aifyVar;
    }

    @Override // defpackage.ailk
    public final java.lang.Object a(int i) {
        return this.a.get(i);
    }
}
