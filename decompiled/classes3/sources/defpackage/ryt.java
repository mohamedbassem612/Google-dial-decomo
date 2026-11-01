package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ryt {
    public final defpackage.sfb a;
    public final java.lang.String b;

    public ryt(defpackage.sfb sfbVar, java.lang.String str) {
        aooh.f(str, "text");
        this.a = sfbVar;
        this.b = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.ryt) {
            defpackage.ryt rytVar = (defpackage.ryt) obj;
            if (this.a == rytVar.a && aooh.n(this.b, rytVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "MyCallingCardShareSettingUiData(shareSetting=" + this.a + ", text=" + this.b + ')';
    }
}
