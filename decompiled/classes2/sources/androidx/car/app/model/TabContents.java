package androidx.car.app.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public class TabContents {
    public static final java.lang.String CONTENT_ID = "TAB_CONTENTS_CONTENT_ID";
    private final defpackage.ze mTemplate;

    TabContents(defpackage.yz yzVar) {
        java.lang.Object obj = yzVar.a;
        this.mTemplate = null;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.car.app.model.TabContents) {
            return j$.util.Objects.equals(this.mTemplate, ((androidx.car.app.model.TabContents) obj).mTemplate);
        }
        return false;
    }

    public java.lang.String getContentId() {
        return "TAB_CONTENTS_CONTENT_ID";
    }

    public defpackage.ze getTemplate() {
        return (defpackage.ze) j$.util.Objects.requireNonNull(this.mTemplate);
    }

    public int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.mTemplate});
    }

    public java.lang.String toString() {
        return "[template: " + this.mTemplate + ']';
    }

    private TabContents() {
        this.mTemplate = null;
    }
}
