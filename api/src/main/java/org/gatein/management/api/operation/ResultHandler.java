/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2011, Red Hat, Inc., and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package org.gatein.management.api.operation;

import org.gatein.management.api.model.Model;

/**
 * @author <a href="mailto:nscavell@redhat.com">Nick Scavelli</a>
 * @version $Revision$
 */
public interface ResultHandler
{
   /**
    * Handle operation completion.
    * @param result result from executing operation
    */
   void completed(Object result);

   /**
    * Used for creating a new model for the successful completion of an operation which can be automatically serialized.
    *
    * @return new model representing the result
    */
   Model completed();

   /**
    * Handle an operation failure.
    *
    * @param failureDescription the failure description
    */
   void failed(String failureDescription);

   /**
    * Used for creating a new model for the failed operation execution which can be automatically serialized.
    * @return new model representing the failure.
    */
   Model failed();
}
