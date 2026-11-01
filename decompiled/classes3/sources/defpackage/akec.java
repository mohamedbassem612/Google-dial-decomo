package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class akec {
    @java.lang.Deprecated
    public akec() {
    }

    public java.lang.String a() {
        throw new java.lang.UnsupportedOperationException(getClass().getSimpleName());
    }

    public final defpackage.akeb d() {
        if (this instanceof defpackage.akeb) {
            return (defpackage.akeb) this;
        }
        throw new java.lang.IllegalStateException("Not a JSON Array: ".concat(toString()));
    }

    public final defpackage.akef e() {
        if (this instanceof defpackage.akef) {
            return (defpackage.akef) this;
        }
        throw new java.lang.IllegalStateException("Not a JSON Object: ".concat(toString()));
    }

    public final defpackage.akeh f() {
        if (this instanceof defpackage.akeh) {
            return (defpackage.akeh) this;
        }
        throw new java.lang.IllegalStateException("Not a JSON Primitive: ".concat(toString()));
    }

    public final java.lang.String toString() {
        try {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            defpackage.akey akeyVar = new defpackage.akey(new defpackage.aket(sb));
            akeyVar.c = (akej) j$.util.Objects.requireNonNull(akej.a);
            defpackage.akeu.a.x(akeyVar, this);
            return sb.toString();
        } catch (java.io.IOException e) {
            throw new java.lang.AssertionError(e);
        }
    }
}
