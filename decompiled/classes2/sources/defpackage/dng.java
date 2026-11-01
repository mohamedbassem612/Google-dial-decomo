package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class dng extends dmq {
    public final defpackage.vk f;

    public dng(defpackage.vk vkVar) {
        super((byte[]) null);
        this.f = vkVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.dng) && aooh.n(this.f, ((defpackage.dng) obj).f);
        }
        return true;
    }

    public final int hashCode() {
        return this.f.hashCode();
    }

    public final java.lang.String toString() {
        return "LoadedFontFamily(typeface=" + this.f + ')';
    }
}
