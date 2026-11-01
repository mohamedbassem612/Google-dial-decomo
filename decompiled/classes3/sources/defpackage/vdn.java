package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vdn {
    public final j$.util.Optional a;
    public final j$.util.Optional b;
    public final j$.util.Optional c;
    public final j$.util.Optional d;
    public final j$.util.Optional e;
    public final j$.util.Optional f;
    public final j$.util.Optional g;
    public final j$.util.Optional h;

    public vdn(j$.util.Optional optional, j$.util.Optional optional2, j$.util.Optional optional3, j$.util.Optional optional4, j$.util.Optional optional5, j$.util.Optional optional6, j$.util.Optional optional7, j$.util.Optional optional8) {
        this.a = optional;
        this.b = optional2;
        this.c = optional3;
        this.d = optional4;
        this.e = optional5;
        this.f = optional6;
        this.g = optional7;
        this.h = optional8;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.vdn) {
            defpackage.vdn vdnVar = (defpackage.vdn) obj;
            if (this.a.equals(vdnVar.a) && this.b.equals(vdnVar.b) && this.c.equals(vdnVar.c) && this.d.equals(vdnVar.d) && this.e.equals(vdnVar.e) && this.f.equals(vdnVar.f) && this.g.equals(vdnVar.g) && this.h.equals(vdnVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode();
    }

    public final java.lang.String toString() {
        j$.util.Optional optional = this.h;
        j$.util.Optional optional2 = this.g;
        j$.util.Optional optional3 = this.f;
        j$.util.Optional optional4 = this.e;
        j$.util.Optional optional5 = this.d;
        j$.util.Optional optional6 = this.c;
        j$.util.Optional optional7 = this.b;
        return "VoicemailUpdateContent{hasAudioContent=" + java.lang.String.valueOf(this.a) + ", mimeType=" + java.lang.String.valueOf(optional7) + ", transcription=" + java.lang.String.valueOf(optional6) + ", transcriptionState=" + java.lang.String.valueOf(optional5) + ", isArchived=" + java.lang.String.valueOf(optional4) + ", isRead=" + java.lang.String.valueOf(optional3) + ", isDeleted=" + java.lang.String.valueOf(optional2) + ", isDirty=" + java.lang.String.valueOf(optional) + '}';
    }

    public vdn() {
        throw null;
    }
}
