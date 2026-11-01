package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class akdj {
    public final long a;
    public final aoin b;
    public long c = -1;
    public final java.util.LinkedHashMap d = ahvr.aH(100);
    public java.util.ArrayList e = new java.util.ArrayList();

    public akdj(long j, aoin aoinVar) {
        this.a = j;
        this.b = aoinVar;
    }

    public final synchronized java.util.List a() {
        java.util.ArrayList arrayList;
        arrayList = this.e;
        this.e = new java.util.ArrayList();
        return arrayList;
    }
}
