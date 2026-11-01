package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alio extends java.lang.Exception {
    public final defpackage.alti a;
    public j$.util.Optional b;

    public alio(java.lang.String str, defpackage.alti altiVar, defpackage.ambf ambfVar) {
        super(str);
        this.b = j$.util.Optional.empty();
        this.a = altiVar;
        this.b = j$.util.Optional.of(ambfVar);
    }

    public alio(java.lang.String str, defpackage.alti altiVar) {
        super(str);
        this.b = j$.util.Optional.empty();
        this.a = altiVar;
    }

    public alio(java.lang.String str) {
        this(str, defpackage.alti.UNKNONW);
    }

    public alio(java.lang.String str, defpackage.alti altiVar, java.lang.Throwable th) {
        super(str, th);
        this.b = j$.util.Optional.empty();
        this.a = altiVar;
    }

    public alio(java.lang.String str, java.lang.Throwable th) {
        this(str, defpackage.alti.UNKNONW, th);
    }
}
