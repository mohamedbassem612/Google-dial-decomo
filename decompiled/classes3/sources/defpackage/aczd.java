package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class aczd implements ahyc {
    public final /* synthetic */ aczk a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ aigf d;

    public /* synthetic */ aczd(aczk aczkVar, boolean z, boolean z2, aigf aigfVar) {
        this.a = aczkVar;
        this.b = z;
        this.c = z2;
        this.d = aigfVar;
    }

    public final java.lang.Object apply(java.lang.Object obj) {
        aigf aigfVar = (aigf) obj;
        if (!this.b) {
            return aigfVar;
        }
        aigf aigfVar2 = this.d;
        return !this.c ? aigfVar2 : this.a.d.c(aigfVar2, aigfVar);
    }
}
