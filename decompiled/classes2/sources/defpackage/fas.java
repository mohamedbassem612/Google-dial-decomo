package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fas {
    public boolean a;
    public boolean b;
    public boolean c;
    public int d = 0;

    public final defpackage.fat a() {
        if (this.a || !(this.b || this.c)) {
            return new defpackage.fat(this);
        }
        throw new java.lang.IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupportedForOffload is false");
    }
}
