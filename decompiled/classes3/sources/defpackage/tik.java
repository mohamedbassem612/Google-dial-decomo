package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tik implements defpackage.tht {
    public final aify b;
    public int c;
    public final int d;
    private final java.lang.String e;

    public tik(android.content.Context context, aify aifyVar, int i) {
        this.b = aifyVar;
        this.d = i;
        if (i == 1) {
            this.e = context.getString(2132017308);
        } else {
            this.e = context.getString(2132020312);
        }
    }

    public final int a() {
        aify aifyVar = this.b;
        if (aifyVar.isEmpty()) {
            return 0;
        }
        return aifyVar.size() + 1;
    }

    @Override // defpackage.tht
    public final java.lang.String b() {
        return this.e;
    }

    @Override // defpackage.tht
    public final boolean c() {
        return this.c == 0;
    }

    public final defpackage.tin d() {
        int i = this.c;
        if (i == 0) {
            return null;
        }
        return (defpackage.tin) this.b.get(i - 1);
    }
}
