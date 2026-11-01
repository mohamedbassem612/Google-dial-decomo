package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class iot {
    public final defpackage.aonj a;
    public final defpackage.aonj b;
    public final defpackage.iov c;
    public final defpackage.iou d;

    public iot(defpackage.aonj aonjVar, defpackage.aonj aonjVar2, defpackage.iov iovVar, defpackage.iou iouVar) {
        this.a = aonjVar;
        this.b = aonjVar2;
        this.c = iovVar;
        this.d = iouVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.iot) {
            defpackage.iot iotVar = (defpackage.iot) obj;
            if (defpackage.aooh.n(this.a, iotVar.a) && defpackage.aooh.n(this.b, iotVar.b) && defpackage.aooh.n(this.c, iotVar.c) && defpackage.aooh.n(this.d, iotVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final java.lang.String toString() {
        return "BackupAccessor(hazzer=" + this.a + ", getter=" + this.b + ", setter=" + this.c + ", clearer=" + this.d + ')';
    }
}
