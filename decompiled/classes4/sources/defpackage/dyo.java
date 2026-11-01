package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class dyo {
    public final android.view.DisplayCutout a;

    public dyo(android.view.DisplayCutout displayCutout) {
        this.a = displayCutout;
    }

    public final dwn a() {
        return dwn.e(this.a.getWaterfallInsets());
    }

    public final java.util.List b() {
        return this.a.getBoundingRects();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return j$.util.Objects.equals(this.a, ((defpackage.dyo) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "DisplayCutoutCompat{" + this.a + '}';
    }
}
