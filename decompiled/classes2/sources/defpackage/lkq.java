package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lkq {
    public java.lang.String a;
    public defpackage.lgp b;
    public java.lang.String c;
    public boolean d;
    public j$.util.OptionalInt e = j$.util.OptionalInt.empty();
    public long f = 0;
    public defpackage.ljx g;

    public final void a(java.lang.String str) {
        ahvr.ci(str);
        this.a = str;
    }

    public final void b(j$.util.OptionalInt optionalInt) {
        boolean z = true;
        if (optionalInt.isPresent()) {
            switch (optionalInt.getAsInt()) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    break;
                default:
                    z = false;
                    break;
            }
        }
        ahvr.bM(z);
        this.e = optionalInt;
    }
}
