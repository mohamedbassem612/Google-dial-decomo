package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class aacq extends java.lang.Exception {
    private final android.content.Intent a;

    public aacq(java.lang.String str, android.content.Intent intent) {
        super(str);
        this.a = intent;
    }

    public final android.content.Intent a() {
        return new android.content.Intent(this.a);
    }
}
