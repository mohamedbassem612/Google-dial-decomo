package androidx.car.app.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public final class TemplateInfo {
    private final java.lang.Class mTemplateClass;
    private final java.lang.String mTemplateId;

    private TemplateInfo() {
        this.mTemplateClass = null;
        this.mTemplateId = null;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.car.app.model.TemplateInfo) {
            androidx.car.app.model.TemplateInfo templateInfo = (androidx.car.app.model.TemplateInfo) obj;
            if (j$.util.Objects.equals(this.mTemplateClass, templateInfo.mTemplateClass) && j$.util.Objects.equals(this.mTemplateId, templateInfo.mTemplateId)) {
                return true;
            }
        }
        return false;
    }

    public java.lang.Class getTemplateClass() {
        return (java.lang.Class) j$.util.Objects.requireNonNull(this.mTemplateClass);
    }

    public java.lang.String getTemplateId() {
        return (java.lang.String) j$.util.Objects.requireNonNull(this.mTemplateId);
    }

    public int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.mTemplateClass, this.mTemplateId});
    }

    public TemplateInfo(java.lang.Class cls, java.lang.String str) {
        this.mTemplateClass = cls;
        this.mTemplateId = str;
    }
}
