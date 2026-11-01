package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qeq {
    public static final ahzf a = ahzf.d("\r\n");
    public final aoin b;

    public qeq(aoin aoinVar) {
        this.b = aoinVar;
    }

    public static int a(java.util.List list) {
        int size = list.size();
        do {
            size--;
            if (size < 0) {
                break;
            }
        } while (((defpackage.qep) list.get(size)).a);
        return size;
    }

    public static int b(java.util.List list) {
        int size = list.size();
        do {
            size--;
            if (size < 0) {
                break;
            }
        } while (!((defpackage.qep) list.get(size)).a);
        return size;
    }

    public static final defpackage.qep c() {
        return new defpackage.qep(j$.time.Instant.now().toEpochMilli());
    }
}
