package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aepg extends defpackage.aepe {
    private final java.lang.String a;

    public aepg(char c) {
        this.a = java.lang.Character.toString(c);
    }

    @Override // defpackage.aepe
    public final /* synthetic */ java.lang.Object a() {
        return this.a;
    }

    @Override // defpackage.aepe
    public final java.lang.String b() {
        return this.a;
    }

    public aepg(java.lang.String str) {
        this.a = str;
    }

    public aepg(defpackage.aenj aenjVar) {
        this.a = java.lang.String.valueOf(aenjVar);
    }

    public aepg(java.lang.Class cls) {
        this.a = cls.getName();
    }

    public aepg(java.lang.Enum r1) {
        this.a = r1.name();
    }
}
